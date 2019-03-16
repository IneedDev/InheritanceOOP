package com.company;

public class Boss extends Manager{

    private int vacation;

    public Boss(String name, String surname, int salary, int vacation) {
        super(name, surname, salary);
        this.vacation = vacation;
    }

    public int getVacation()    {
        return vacation;
    }

    public void setVacation(int vacation) {
        this.vacation = vacation;
    }

    @Override
    public void shout() {
        System.out.println("jest bardzo ok ");
    }
}
