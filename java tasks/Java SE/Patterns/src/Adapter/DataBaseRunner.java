package Adapter;

public class DataBaseRunner {
    public static void main(String[] args) {
        DataBase database = new AdapterJavaToDatabase();

        database.insert();
        database.update();
        database.select();
        database.remove();
    }
}