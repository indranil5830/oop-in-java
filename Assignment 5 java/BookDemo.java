import java.util.Scanner;

class Book {
    int bookId;
    String bookTitle;
    String authorName;
    double price;

    void acceptDetails(Scanner sc) {
        System.out.print("Enter Book ID: ");
        bookId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Book Title: ");
        bookTitle = sc.nextLine();
        System.out.print("Enter Author Name: ");
        authorName = sc.nextLine();
        System.out.print("Enter Price: ");
        price = sc.nextDouble();
    }

    void displayInformation() {
        System.out.println("\nBook ID: " + bookId);
        System.out.println("Title: " + bookTitle);
        System.out.println("Author: " + authorName);
        System.out.println("Price: " + price);
    }

    void applyDiscount() {
        double finalPrice = price;
        if (price > 1000) {
            finalPrice = price - (price * 0.10);
        }
        System.out.println("Final Price after discount (if any): " + finalPrice);
    }
}

public class BookDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Book b1 = new Book();
        b1.acceptDetails(sc);
        b1.displayInformation();
        b1.applyDiscount();
        sc.close();
    }
}