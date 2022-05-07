package com.company;

public class Programmers extends Workers implements Actions,Information {
    int id;
    String nickname;
    int salary;
    String gender;
    int bonussalary;
    String work_format;
    double KPIvalue;//0 // 1


    public Programmers() {
    }

    public Programmers(int id, String nickname, int salary, String gender, int bonussalary, String work_format, double KPIvalue) {
        this.id = id;
        this.nickname = nickname;
        this.salary = salary;
        this.gender = gender;
        this.bonussalary = bonussalary;
        this.work_format = work_format;
        this.KPIvalue = KPIvalue;
    }

    @Override
    public String toString() {
        return "Programmers{" +
                "id=" + id +
                ", nickname='" + nickname + '\'' +
                ", salary=" + salary +
                ", gender='" + gender + '\'' +
                ", bonussalary=" + bonussalary +
                ", work_format='" + work_format + '\'' +
                ", KPIvalue=" + KPIvalue +
                '}';
    }

    public double Value(){
        double res;
        return res=salary+(KPIvalue*bonussalary);
    }

    @Override
    String getWorketData() {
        return this.nickname;
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
        if(work_format.equals("online")){
            System.out.println("Working online");

        }else{
            System.out.println("Working offline");
        }

    }

    @Override
    public void sleep() {
        System.out.println(this.nickname+"sleeping");
    }

    @Override
    public void eat() {
        System.out.println(this.nickname+"eating");
    }

    @Override
    public void travel() {
        System.out.println(this.nickname+"travelling");
    }

    @Override
    public void showInfo() {
        System.out.println(this.id+"Nickname:"+this.nickname+" Salary:"+this.salary+"Bonus"+this.bonussalary+"");
    }

    @Override
    public void showEmail() {
        System.out.println("Email "+this.nickname);
    }

    @Override
    public void showSalary() {
        System.out.println(this.salary);

    }
}
