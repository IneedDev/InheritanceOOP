package ZOO_Inheritance;

public class Main {

    public static void main(String[] args) {
        // write your code here

        Bear bear = new Bear(1,"Yogi",200,40);
        Tiger tiger = new Tiger(2,"Jataka",150,25);
        Wolf wolf = new Wolf(3,"Howler",70,40);
        Dog dog = new Dog(4,"Scooby",30);

        Animal[] animals = {bear,wolf,tiger,dog};
        for (Animal animal : animals) {
            animal.introduce();
        }

        Animal[] hoowlers = {wolf, dog};
        for (Animal animal : hoowlers) {
            System.out.print("My name is: " + animal.getName());

            Canine animalAsCanine =  (Canine) animal;
            animalAsCanine.bark();
        }

        dog.sitPretty();

    }
}

