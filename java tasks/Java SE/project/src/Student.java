public class Student{

    public int id;
    public String name;
    public String surname;
    public double gpa;

    public Student(){

    }

    public Student(int id, String name, String surname, double gpa){
        this.name = name;
        this.id = id;
        this.surname = surname;
        this.gpa = gpa;
    }

    public String getStudentData(){
        return this.id + " " + this.name + " " + this.surname + " " + this.gpa;
    }

}