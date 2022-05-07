package com.company;

import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicBoolean;

public class Main {
    public static Connection conn;

    public static void main(String[] args) {
        // write your code here
        Scanner in = new Scanner(System.in);
        ArrayList<Items> items = new ArrayList<>();
        boolean check = connect();
        if (check) {
            System.out.println("Connected!!!");
        } else {
            System.out.println("ERROR");
        }

        while (true) {
            System.out.println("[1] Add new products");
            System.out.println("[2] List all products");
            System.out.println("[3] DELETE product");
            System.out.println("[4] Update products");
            System.out.println("[0] exit");

            int choice = in.nextInt();
            if (choice == 1) {
                System.out.println("Insert name: ");
                String name = in.next();
                System.out.println("Insert price");
                double price = in.nextDouble();
                addProduct(new Items(null, name, price));
            } else if (choice == 2) {
                items = getAllitems();
                for (Items i1 : items) {
                    System.out.println(i1);
                }
            } else if (choice == 3) {
                System.out.println("Insert id:");
                Long id = in.nextLong();
                deleteproducts(id);
            }
            else if(choice==4){
                System.out.println("Insert ID:");
                Long id=in.nextLong();
                System.out.println("Insert name: ");
                String name = in.next();
                System.out.println("Insert price");
                double price = in.nextDouble();
               Items i=new Items(id,name,price);
               updateProducts(i);
            }
            else if(choice==0){
                System.exit(0);


            }
        }
    }

    public static boolean connect() {
        boolean check = false;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/shop", "root", "");///insert our database url
            check = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return check;
    }

    public static void addProduct(Items i) {
        try {
            PreparedStatement statement =
                    conn.prepareStatement("INSERT INTO products (id, name, price) VALUES (NULL, ?, ?) ");

            statement.setString(1, i.getName());
            statement.setDouble(2, i.getPrice());


            statement.executeUpdate();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return;
    }


    public static ArrayList<Items> getAllitems() {
        ArrayList<Items> it = new ArrayList<>();
        try {
            Statement st = conn.createStatement();
            String sql = "select * from products";
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()) {
                Long id = rs.getLong("id");
                String name = rs.getString("name");
                int price = rs.getInt("price");
                Items i1 = new Items(id, name, price);
                it.add(i1);


            }
            st.close();
        } catch (Exception e) {
            e.printStackTrace();

        }
        return it;
    }

    public static void deleteproducts(Long id) {
        try {
            PreparedStatement st = conn.prepareStatement("DELETE FROM products where id = ?");
            st.setLong(1,id);
            st.executeUpdate();
            st.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    public static void updateProducts(Items i){
        try {
            PreparedStatement st = conn.prepareStatement("update products set name = ?, price = ?");
            st.setString(1,i.getName());
            st.setDouble(2,i.getPrice());
            st.executeUpdate();


        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
