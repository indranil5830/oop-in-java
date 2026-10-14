import java.util.Scanner;

public class user {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Step 1: Create login details
        System.out.print("Create username: ");
        String storedUsername = scanner.nextLine();

        System.out.print("Create password: ");
        String storedPassword = scanner.nextLine();

        System.out.println("\nLogin now...");

        // Step 2: Ask user to enter username and password
        System.out.print("Enter username: ");
        String inputUsername = scanner.nextLine();

        System.out.print("Enter password: ");
        String inputPassword = scanner.nextLine();

        // Step 3: Check if input matches stored details
        if (inputUsername.equals(storedUsername) && inputPassword.equals(storedPassword)) {
            System.out.println("Login successful! Welcome " + inputUsername);
        } else {
            System.out.println("Invalid username or password. Try again.");
        }

        scanner.close();
    }
}
