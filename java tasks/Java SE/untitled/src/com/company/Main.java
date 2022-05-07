package com.company;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    private static Connection connection;

    private static void connect(){
        try{

            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/library", "root", "");

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    private static void disconnect() {
        try {

            connection.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {

        connect();

        Scanner in = new Scanner(System.in);

        while(true){

            System.out.println("PRESS 1 TO ADD BOOK");
            System.out.println("PRESS 2 TO LIST BOOK");
            System.out.println("PRESS 0 TO EXIT");

            String choice = in.next();

            if(choice.equals("1")){

                System.out.println("Insert name:");
                String name = in.next();
                System.out.println("Insert author:");
                String author = in.next();
                System.out.println("Insert price:");
                int price = in.nextInt();

                addBook(new Book(null, name, author, price));

            }else if(choice.equals("2")){

                ArrayList<Book> books = getAllBooks();

                for(int i=0;i<books.size();i++){
                    System.out.println(
                            books.get(i).getId()
                                    + " " + books.get(i).getName()
                                    + " " + books.get(i).getAuthor()
                                    + " " + books.get(i).getPrice() + " KZT"
                    );
                }

            }else if(choice.equals("0")){
                disconnect();
                break;
            }

        }

    }

    private static void addBook(Book book){

        try{

            PreparedStatement statement =
                    connection.prepareStatement("INSERT INTO books (id, name, author, price) VALUES (NULL, ?, ?, ?) ");

            statement.setString(1, book.getName());
            statement.setString(2, book.getAuthor());
            statement.setInt(3, book.getPrice());

            statement.executeUpdate();
            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    private static ArrayList<Book> getAllBooks(){
        ArrayList<Book> allBooks = new ArrayList<>();

        try{

            PreparedStatement statement =
                    connection.prepareStatement("SELECT * FROM books");

            ResultSet result = statement.executeQuery();

            while(result.next()){

                Long id = result.getLong("id");
                String name = result.getString("name");
                String author = result.getString("author");
                int price = result.getInt("price");

                allBooks.add(new Book(id, name, author, price));

            }

            statement.close();

        }catch (Exception e){
            e.printStackTrace();
        }

        return allBooks;
    }



}