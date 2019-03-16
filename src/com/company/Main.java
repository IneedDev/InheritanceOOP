package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Worker worker = new Worker("Damian", "Kowalski");

        Manager manager = new Manager("John","Kowalski",1500);

        Boss boss = new Boss("Albert", "Kowalski",1500,40);
        System.out.println(manager.getName());
        System.out.println(worker.getName());
        System.out.println(boss.getVacation()+boss.getName());

        Manager manager1 = new Manager();

        System.out.println(manager1.getName()+" "+manager1.getSurname()+" "+manager1.getSalary());

        manager.shout();
        boss.shout();
        worker.shout();

        // polimorfizm
        // wyrazamy managera jako workerem

        Worker managerIsWorker = (Worker) manager;
        managerIsWorker.shout();

        // tablica roznych lecz dziedziczacych po sobie klass
        // deklaracja / obietnica ze w pamieci bedzie worker = tu spelniamy ja
        Worker[] workers = {worker,boss,manager};
        for (Worker worker1 : workers){
            System.out.println("Imiona dla wszystkich pracowników " + worker1.getName());
            worker1.shout();
        }
        printName(worker);
        printName(boss);
        printName(manager);

        worker.jump();
        manager.jump();
        boss.jump();

        // polimorfizm
        CanJump jump = manager;
        jump.jump();

    }
    public static void printName(Worker worker){
        System.out.println("Nowy pracownik " + worker.getName());
    }
}
