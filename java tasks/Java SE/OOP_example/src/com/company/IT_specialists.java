package com.company;

public class IT_specialists extends Workers implements Information,Bonus {
    int id;
    int age;
    String fullname;
    int salary;
    int worktime;
    String email;
    String role;

    public IT_specialists() {
    }

    public IT_specialists(int id, int age, String fullname, int salary, int worktime, String email, String role) {
        this.id = id;
        this.age = age;
        this.fullname = fullname;
        this.salary = salary;
        this.worktime = worktime;
        this.email = email;
        this.role = role;
    }

    @Override
    public String toString() {
        return "IT_specialists{" +
                "id=" + id +
                ", age=" + age +
                ", fullname='" + fullname + '\'' +
                ", salary=" + salary +
                ", worktime=" + worktime +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                '}';
    }

    public void checkrole() {
        if (worktime > 10) {
            System.out.println("Congratullations You've been promoted");
        } else {
            System.out.println("Working hard");
        }
    }

    @Override
    String getWorketData() {
        return "ID" + id + "Age:" + age + "fullname" + fullname + "Worktime" + worktime + "Email:" + email + "Role" + role;
    }

    @Override
    int getSalary() {
        return salary;
    }

    @Override
    boolean health() {
        return true;
    }

    @Override
    void formatWork() {
        System.out.println("working offline");
    }

    @Override
    public int vacation_salary() {
        int res = 0;
        return res += salary;
    }

    @Override
    public boolean vacation() {
        if (worktime>6&&worktime>12) {
            return true;
        }else {
           return false;
        }
    }



    @Override
    public void retirement() {
        if(this.age>63){
            System.out.println("You must go retirement");
        }else {
            System.out.println("you can work farther ");

        }    }

    @Override
    public void showInfo() {
        System.out.println("id=" + id +
                ", age=" + age +
                ", fullname='" + fullname + '\'' +
                ", salary=" + salary +
                ", worktime=" + worktime +
                ", email='" + email + '\'' +
                ", role='" + role + '\'' +
                '}');
    }

    @Override
    public void showEmail() {
        System.out.println("email"+email);
    }

    @Override
    public void showSalary() {
        System.out.println("Salary:"+salary);
    }
}
