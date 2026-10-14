import java.util.Scanner;

class Student {
    int rollNumber;
    String name;
    String department;
    double marks;

    void acceptDetails(Scanner sc) {
        System.out.print("Enter Roll Number: ");
        rollNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Name: ");
        name = sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
        System.out.print("Enter Marks: ");
        marks = sc.nextDouble();
    }

    void displayDetails() {
        System.out.println("\nRoll Number: " + rollNumber);
        System.out.println("Name: " + name);
        System.out.println("Department: " + department);
        System.out.println("Marks: " + marks);
    }

    void calculateGrade() {
        char grade;
        if (marks >= 90) grade = 'A';
        else if (marks >= 75) grade = 'B';
        else if (marks >= 60) grade = 'C';
        else if (marks >= 40) grade = 'D';
        else grade = 'F';
        System.out.println("Grade: " + grade);
    }
}

public class StudentDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.acceptDetails(sc);
        s1.displayDetails();
        s1.calculateGrade();
        sc.close();
    }
}