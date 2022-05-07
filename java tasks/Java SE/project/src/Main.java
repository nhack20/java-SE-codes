import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int[] books = new int[n];
        for(int i=0; i<n; i++){
            books[i] = scan.nextInt();
            int max=books[0];
            if(max<books[i]){
                max=books[i];
            }
            System.out.println(max);
        }

        Student st1 = new Student();
        st1.name = "John";
        st1.surname = "Smith";
        st1.id = 1;
        st1.gpa = 3.4;

        Student st2 = new Student(2, "Alan", "Parker", 3.5);
        Student st3 = new Student(3, "Michael", "Andrew", 2.1);
        Student st4 = new Student(4, "Sony", "Vaio", 3.2);
        Student st5 = new Student(5, "Arman", "Nurbekov", 3.0);

        Student[] allStudents = {st1, st2, st3, st4, st5};

        for (int i = 0; i < allStudents.length; i++) {

            System.out.println(allStudents[i].getStudentData());

        }

        System.out.println("The best student of array is: ");
        topStudent(allStudents);
        System.out.println("The longest surname length is : ");
        maxSurnameLength(allStudents);

    }

    public static void topStudent(Student students[]) {

        Student best = students[0];

        for (int i = 0; i < students.length; i++) {
            if (best.gpa < students[i].gpa) {
                best = students[i];
            }
        }

        System.out.println(best.getStudentData());

    }

    public static void maxSurnameLength(Student students[]) {

        Student max = students[0];

        for (int i = 0; i < students.length; i++) {
            if (max.surname.length() < students[i].surname.length()) {
                max = students[i];
            }
        }

        System.out.println(max.getStudentData());

    }

}