import java.util.Scanner;

class Rectangle {
    double length;
    double width;

    void acceptDimensions(Scanner sc) {
        System.out.print("Enter Length: ");
        length = sc.nextDouble();
        System.out.print("Enter Width: ");
        width = sc.nextDouble();
    }

    double calculateArea() {
        return length * width;
    }

    double calculatePerimeter() {
        return 2 * (length + width);
    }

    void displayResults() {
        System.out.println("Area: " + calculateArea());
        System.out.println("Perimeter: " + calculatePerimeter());
    }
}

public class RectangleDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Rectangle r1 = new Rectangle();
        r1.acceptDimensions(sc);
        r1.displayResults();
        sc.close();
    }
}