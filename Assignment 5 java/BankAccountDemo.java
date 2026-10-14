

import java.util.Scanner;

class BankAccount {
    int accountNumber;
    String accountHolderName;
    double balance;

    void deposit(double amount) {
        balance += amount;
        System.out.println("Deposited: " + amount);
    }

    void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    void displayDetails() {
        System.out.println("\nAccount Number: " + accountNumber);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Current Balance: " + balance);
    }
}

public class BankAccountDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        BankAccount acc = new BankAccount();

        System.out.print("Enter Account Number: ");
        acc.accountNumber = sc.nextInt();
        sc.nextLine();
        System.out.print("Enter Account Holder Name: ");
        acc.accountHolderName = sc.nextLine();
        System.out.print("Enter Initial Balance: ");
        acc.balance = sc.nextDouble();

        acc.deposit(500);
        acc.withdraw(200);
        acc.withdraw(100000); // will show insufficient balance
        acc.displayDetails();

        sc.close();
    }
}
