public class Circle {

    private static int radius;

    public static int getRadius() {
        return radius;
    }

    public static void setRadius(int radius) {
        Circle.radius = radius;
    }

    private static double x = Math.PI;


    public static void area(){

        System.out.println("Area of circle is: " + radius*radius*x);


    }

        public static void circumference(){
            System.out.println("Circumference of circle is: " + 2*radius*x);

}}
