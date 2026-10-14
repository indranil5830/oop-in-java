import java.util.Scanner;

class Time {
    int hours;
    int minutes;
    int seconds;

    void acceptTime(Scanner sc) {
        System.out.print("Enter Hours: ");
        hours = sc.nextInt();
        System.out.print("Enter Minutes: ");
        minutes = sc.nextInt();
        System.out.print("Enter Seconds: ");
        seconds = sc.nextInt();
    }

    void displayTime() {
        System.out.printf("Time in HH:MM:SS format: %02d:%02d:%02d%n", hours, minutes, seconds);
    }

    int convertToTotalSeconds() {
        int totalSeconds = (hours * 3600) + (minutes * 60) + seconds;
        System.out.println("Total Seconds: " + totalSeconds);
        return totalSeconds;
    }
}

public class TimeDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Time t1 = new Time();
        t1.acceptTime(sc);
        t1.displayTime();
        t1.convertToTotalSeconds();
        sc.close();
    }
}