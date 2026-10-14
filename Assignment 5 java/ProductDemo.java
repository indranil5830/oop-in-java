
import java.util.Scanner;

class Product {
    int productId;
    String productName;
    int quantity;
    double unitPrice;

    void acceptDetails(Scanner sc) {
        System.out.print("Enter Product ID: ");
        productId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Product Name: ");
        productName = sc.nextLine();
        System.out.print("Enter Quantity: ");
        quantity = sc.nextInt();
        System.out.print("Enter Unit Price: ");
        unitPrice = sc.nextDouble();
    }

    double calculateTotalBill() {
        return quantity * unitPrice;
    }

    void displayDetails() {
        System.out.println("\nProduct ID: " + productId);
        System.out.println("Product Name: " + productName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Unit Price: " + unitPrice);
        System.out.println("Total Bill Amount: " + calculateTotalBill());
    }
}

public class ProductDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Creating multiple objects to represent different products
        Product p1 = new Product();
        System.out.println("--- Product 1 ---");
        p1.acceptDetails(sc);
        p1.displayDetails();

        Product p2 = new Product();
        System.out.println("\n--- Product 2 ---");
        p2.acceptDetails(sc);
        p2.displayDetails();

        sc.close();
    }
}