import java.util.Scanner;

class Employee {
    int employeeId;
    String employeeName;
    double basicSalary;

    void acceptDetails(Scanner sc) {
        System.out.print("Enter Employee ID: ");
        employeeId = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Employee Name: ");
        employeeName = sc.nextLine();
        System.out.print("Enter Basic Salary: ");
        basicSalary = sc.nextDouble();
    }

    double calculateGrossSalary() {
        double hra = basicSalary * 0.20;
        double da = basicSalary * 0.50;
        return basicSalary + hra + da;
    }

    void displayDetails() {
        System.out.println("\nEmployee ID: " + employeeId);
        System.out.println("Employee Name: " + employeeName);
        System.out.println("Basic Salary: " + basicSalary);
        System.out.println("Gross Salary: " + calculateGrossSalary());
    }
}

public class EmployeeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Employee e1 = new Employee();
        e1.acceptDetails(sc);
        e1.displayDetails();
        sc.close();
    }
}