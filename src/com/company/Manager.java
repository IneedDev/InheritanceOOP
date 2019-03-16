package com.company;

public class Manager extends Worker{

    private int salary;

    public Manager(String name, String surname, int salary) {
        super(name, surname);
        this.salary = salary;
    }

    public Manager(){
        this("No Name","No surname",0);
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    @Override
    public void shout() {
        System.out.println("jest ok ");
    }
}
