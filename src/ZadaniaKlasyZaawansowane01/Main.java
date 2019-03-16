package ZadaniaKlasyZaawansowane01;

public class Main {

    public static void main(String[] args) {
        MyWater myWater = new MyWater();

        myWater.addLarge(2);
        myWater.addMedium(1);
        myWater.addSmall(3);

        myWater.sumVolueme();
        System.out.println("Duze butelki " + myWater.getNumberLargeB());
        System.out.println("Srednie butelki " + myWater.getNumberMediumB());
        System.out.println("Male butelki " + myWater.getNumberSmallB());

    }
}
