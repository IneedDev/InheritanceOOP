package ZOO_Inheritance;

public class Wolf extends Animal implements Canine{

    private int fangElngth;

    public Wolf(int id, String name, float weight, int fangElngth) {
        super(id, name, weight);
        this.fangElngth = fangElngth;
    }

    @Override
    public void bark() {
        System.out.println("BARK BARK BARK");
    }

    @Override
    public void introduce() {
        System.out.println(getId() + ". I'm a wolf. My name is " + getName() + ", my weight is " + getWeight() + " kg");
    }
}

