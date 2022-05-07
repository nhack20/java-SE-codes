import java.util.Scanner;
import java.util.SortedMap;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        BankApplication bank1= new BankApplication("Halyk", "Kazakhstan");
        System.out.println("Welcone to " +" "+ bank1.getName());
        while (true) {
        System.out.println("PRESS [1] TO ADD WORKER");
        System.out.println("PRESS [2] TO LIST WORKERS");
        System.out.println("PRESS [0] TO EXIT");
        String choice = in.next();

            if (choice.equals("1")) {
                System.out.println("enter ID:");
                int id = in.nextInt();
                System.out.println("Enter your name");
                String name = in.next();
                System.out.println("Enter surname: ");
                String surname = in.next();
                System.out.println("Enter department: ");
                String department = in.next();
                System.out.println("Enter salary");
                int salary = in.nextInt();
                Worker worker1 = new Worker(id, name, surname, department, salary);
                bank1.addWorker(worker1);

            } else if (choice.equals("2")) {
                bank1.listworkers();
            } else if(choice.equals("0")){
                System.exit(0);
                System.out.println("GOOD bye");

            }
        }
    }
}
