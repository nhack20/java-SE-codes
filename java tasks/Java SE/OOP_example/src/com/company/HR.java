package com.company;

public class HR extends Workers implements Information,Actions{
    int id;
    String fullname;
    int age;
    int salary;
    int candidate_number;
    String health;
    String email;

    public HR() {
    }

    public HR(int id, String fullname, int age, int salary, int candidate_number, String health, String email) {
        this.id = id;
        this.fullname = fullname;
        this.age = age;
        this.salary = salary;
        this.candidate_number = candidate_number;
        this.health = health;
        this.email = email;
    }

    @Override
    public String toString() {
        return "HR{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", candidate_number=" + candidate_number +
                ", health='" + health + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    public void candidate() {
        if (this.candidate_number > 10) {
            int result;
            result = salary + 4000;
            System.out.println(result);
        }
        else{
            System.out.println("You need to a lot of work");
        }
    }

    @Override
    String getWorketData() {
        return  "HR{" +
                "id=" + id +
                ", fullname='" + fullname + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", candidate_number=" + candidate_number +
                ", health='" + health + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    int getSalary() {
        return this.salary;
    }

    @Override
    boolean health() {
        if (health.equals("healthy")) {
           return true;
        } else {
            return false;
        }

    }


    @Override
    void formatWork() {
        System.out.println("You are working offline");
    }

    @Override
    public void sleep() {
        System.out.println(this.fullname+"sleeps at 11:00 pm");
    }

    @Override
    public void eat() {
        System.out.println(this.fullname+"Eating at 2 pm");
    }

    @Override
    public void travel() {
        System.out.println(this.fullname+"Travelling each year");
    }

    @Override
    public void showInfo() {
        System.out.println(
                "HR{" +
                        "id=" + id +
                        ", fullname='" + fullname + '\'' +
                        ", age=" + age +
                        ", salary=" + salary +
                        ", candidate_number=" + candidate_number +
                        ", health='" + health + '\'' +
                        ", email='" + email + '\'' +
                        '}');
    }

    @Override
    public void showEmail() {
        System.out.println("Email: "+this.email);
    }

    @Override
    public void showSalary() {
        System.out.println(this.salary);
    }
}
