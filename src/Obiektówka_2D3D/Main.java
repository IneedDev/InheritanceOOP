package Obiektówka_2D3D;

public class Main {

    public static void main(String[] args) {

        Point2D point2D = new Point2D();
        Point2D point2D1 = new Point2D(5,4);

        Point3D point3D = new Point3D(4,8,9);

        System.out.println(point3D);

        Point3D newPoint3D = new Point3D(point2D,1);
        System.out.println(newPoint3D);

        System.out.println( "x " + point2D.getX() + " y " + point2D.getY());
        System.out.println( "x " + point2D1.getX() + " y " + point2D1.getY());
        System.out.println( "x " + point3D.getX() + " y " + point3D.getY() + " z " + point3D.getZ());






    }
}
