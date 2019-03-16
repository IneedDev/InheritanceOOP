package ZadaniaKlasyZaawansowane01;

public class MyWater {
    private static int largeB;
    private static  int mediumB;
    private static double smallB;

    private int numberLargeB;
    private int numberMediumB;
    private int numberSmallB;



    public int getLargeB() {
        return largeB;
    }

    public void setLargeB(int largeB) {
        this.largeB = largeB;
    }

    public int getMediumB() {
        return mediumB;
    }

    public void setMediumB(int mediumB) {
        this.mediumB = mediumB;
    }

    public double getSmallB() {
        return smallB;
    }

    public void setSmallB(double smallB) {
        this.smallB = smallB;
    }

    public int getNumberLargeB() {
        return numberLargeB;
    }

    public void setNumberLargeB(int numberLargeB) {
        this.numberLargeB = numberLargeB;
    }

    public int getNumberMediumB() {
        return numberMediumB;
    }

    public void setNumberMediumB(int numberMediumB) {
        this.numberMediumB = numberMediumB;
    }

    public int getNumberSmallB() {
        return numberSmallB;
    }

    public void setNumberSmallB(int numberSmallB) {
        this.numberSmallB = numberSmallB;
    }

    public void addLarge(int numberLargeB){
        setNumberLargeB(numberLargeB);


    }
    public void addMedium( int numberMediumB){
        setNumberMediumB(numberMediumB);
    }
    public void addSmall(int numberSmallB){
        setNumberSmallB(numberSmallB);

    }
    public void sumVolueme(){
        int v1=getNumberLargeB()*getLargeB();
        int v2 =getNumberMediumB()*getMediumB();
        double v3 = getNumberSmallB()*getSmallB();
        System.out.println("Mamy teraz "+(v1+v2+v3));
    }

    @Override
    public String toString() {
        return "MyWater{" +
                "largeB=" + largeB +
                ", mediumB=" + mediumB +
                ", smallB=" + smallB +
                ", numberLargeB=" + numberLargeB +
                ", numberMediumB=" + numberMediumB +
                ", numberSmallB=" + numberSmallB +
                '}';
    }
}
