package com.company;

public class Teachers extends Workers implements Actions,Information{
    String id;
    String fullname;
    int salary;
    int age;
    String gender;
    String email;

    public Teachers() {
    }

    public Teachers(String id, String fullname, int age, String gender, String email) {
        this.id = id;
        this.fullname = fullname;
        this.salary=salary;
        this.age = age;
        this.gender = gender;
        this.email = email;
    }

    @Override
    public String toString() {
        return "Teachers{" +
                "id='" + id + '\'' +
                ", fullname='" + fullname + '\'' +
                "salaty"+salary+
                ", age=" + age +
                ", gender='" + gender + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
    void checkedattendance(){
        System.out.println(this.fullname+"Checked attendance");

    }

    @Override
    String getWorketData() {
        return this.fullname;
    }

    @Override
    int getSalary() {
        return this.salary;
    }

    @Override
    boolean health() {
        if(this.age>63){
            return false;
        }else{
            return true;
        }
    }

    @Override
    void formatWork() {
        System.out.println("Working offline");
    }

    @Override
    public void sleep() {
        System.out.println(this.fullname+"Sleps after 11.00 pm");
    }

    @Override
    public void eat() {
        System.out.println(this.fullname+"Eating after 2 pm");
    }

    @Override
    public void travel() {
        System.out.println(this.fullname+"never travelling");
    }

    @Override
    public void showInfo() {
        System.out.println("Id"+this.id+"Fullname"+this.fullname+"Salary"+this.salary+"Age"+this.age+"Female"+this.gender+"Email"+this.email);
    }

    @Override
    public void showEmail() {
        if(email.contains("iitu.edu")){
            System.out.println("Email correct");

        }else{
            System.out.println("Email  incorrect");
        }
    }

    @Override
    public void showSalary() {
        System.out.println(this.fullname+"has"+this.salary);
    }
}
