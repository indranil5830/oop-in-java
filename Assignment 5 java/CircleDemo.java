import java.util.Scanner;

class Circle {
    double radius;

    void acceptRadius(Scanner sc) {
        System.out.print("Enter Radius: ");
        radius = sc.nextDouble();
    }

    double calculateArea() {
        return Math.PI * radius * radius;
    }

    double calculateCircumference() {
        return 2 * Math.PI * radius;
    }

    void displayValues() {
        System.out.println("Area: " + calculateArea());
        System.out.println("Circumference: " + calculateCircumference());
    }
}

public class CircleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Circle c1 = new Circle();
        c1.acceptRadius(sc);
        c1.displayValues();
        sc.close();
    }
}