import java.util.Scanner;

class Car {
    String carNumber;
    String brand;
    String model;
    double mileage;

    void acceptDetails(Scanner sc) {
        System.out.print("Enter Car Number: ");
        carNumber = sc.nextLine();
        System.out.print("Enter Brand: ");
        brand = sc.nextLine();
        System.out.print("Enter Model: ");
        model = sc.nextLine();
        System.out.print("Enter Mileage (km/l): ");
        mileage = sc.nextDouble();
    }

    void displayDetails() {
        System.out.println("\nCar Number: " + carNumber);
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Mileage: " + mileage + " km/l");
    }

    void checkFuelEfficiency() {
        if (mileage >= 20) {
            System.out.println("This car is Fuel Efficient.");
        } else {
            System.out.println("This car is NOT Fuel Efficient.");
        }
    }
}

public class CarDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car c1 = new Car();
        c1.acceptDetails(sc);
        c1.displayDetails();
        c1.checkFuelEfficiency();
        sc.close();
    }
}