package com.company;

public class Worker extends Employee implements CanJump{
    private String name;
    private String surname;

    public Worker(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    // krzyczy po implementacji CanJumap
    // dlatego tzreba override


    @Override
    public void jump() {
        System.out.println("Employee moze skakac");
    }

    public void shout(){
        System.out.println("Bida w państwie");
    }
}
