import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Write radius of circle here >>>");
        Circle.setRadius(scanner.nextByte());
        System.out.println("Our answer is here!!!");
            Circle.area();
            Circle.circumference();
    }
}