import java.util.Scanner;

class College {
    String collegeName;
    String department;
    int numberOfStudents;
    int numberOfFacultyMembers;

    void acceptDetails(Scanner sc) {
        System.out.print("Enter College Name: ");
        collegeName = sc.nextLine();
        System.out.print("Enter Department: ");
        department = sc.nextLine();
        System.out.print("Enter Number of Students: ");
        numberOfStudents = sc.nextInt();
        System.out.print("Enter Number of Faculty Members: ");
        numberOfFacultyMembers = sc.nextInt();
    }

    void displayInformation() {
        System.out.println("\nCollege Name: " + collegeName);
        System.out.println("Department: " + department);
        System.out.println("Number of Students: " + numberOfStudents);
        System.out.println("Number of Faculty Members: " + numberOfFacultyMembers);
    }

    void calculateStudentFacultyRatio() {
        double ratio = (double) numberOfStudents / numberOfFacultyMembers;
        System.out.println("Student-to-Faculty Ratio: " + ratio + " : 1");
    }
}

public class CollegeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        College c1 = new College();
        c1.acceptDetails(sc);
        c1.displayInformation();
        c1.calculateStudentFacultyRatio();
        sc.close();
    }
}