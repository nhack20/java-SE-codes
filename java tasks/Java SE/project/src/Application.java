import java.util.Scanner;

public class Application {
    public static void main(String[] args) {

        Scanner in=new Scanner(System.in);
        Student allStudents[] = new Student[10000];

        int size = 0;

        while(true){

            System.out.println("PRESS [1] TO ADD STUDENT");
            System.out.println("PRESS [2] TO LIST STUDENTS");
            System.out.println("PRESS [0] TO EXIT");

            String choice = in.next();

            if(choice.equals("1")){

                System.out.println("Insert name ?");
                String name = in.next();

                System.out.println("Insert surname ?");
                String surname = in.next();

                System.out.println("Insert gpa ?");
                double gpa = in.nextDouble();

                Student st = new Student(size+1, name, surname, gpa);
                allStudents[size] = st;
                size++;

            }else if(choice.equals("2")){

                for(int i=0;i<size;i++){
                    System.out.println(allStudents[i].getStudentData());
                }

            }else if(choice.equals("0")){
                System.exit(0);
            }

        }

    }
}