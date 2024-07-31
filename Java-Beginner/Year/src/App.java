import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        // Open scanner
        Scanner scanner = new Scanner(System.in);

        // Loop to ask for year input 5 times
        for (int i = 0; i < 5; i++) {
            System.out.print("Please enter the year: ");
            int year = scanner.nextInt();

            // Check for leap year
            if (year % 400 == 0) {
                System.out.println(year + " is a Leap year.");
            } else if (year % 100 == 0) {
                System.out.println(year + " is not a Leap year.");
            } else if (year % 4 == 0) {
                System.out.println(year + " is a Leap year.");
            } else {
                System.out.println(year + " is not a Leap year.");
            }
        }

        // Close scanner
        scanner.close();
    }
}



