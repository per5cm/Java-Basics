import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);



        System.out.println("Wählen Sie die Operation:");
        System.out.println("1. Addition - zwei Zahlen eingeben:");
        System.out.println("2. Subtraktion - zwei Zahlen eingeben:");
        System.out.println("3. Multiplikation - zwei Zahlen eingeben:");
        System.out.println("4. Division - zwei Zahlen eingeben:");
        System.out.println("5. Modulo - zwei Zahlen eingeben:");
        

        int choice = scanner.nextInt();

        System.out.print("Bitte erste Zahl eingeben: ");
        int ersteZahl = scanner.nextInt();

        System.out.println("Bitte zweite Zahl eingeben: ");
        int zweiteZahl = scanner.nextInt();
         

        switch (choice) {
            case 1: 
            System.out.println("Die Addition ist: " + ((double)ersteZahl + zweiteZahl));
            case 2: 
            System.out.println("Die Subtraktion ist: " + ((double)ersteZahl - zweiteZahl));
            case 3: 
            System.out.println("Die Multiplikation ist: " + ((double)ersteZahl * zweiteZahl));
            case 4: 
            if (zweiteZahl !=0) {
                System.out.println("Die Division ist: " + ((double)ersteZahl / zweiteZahl));
            } else {
                System.out.println("Fehler: Division durch '0' nicht möglich! ");
            } 
            case 5:
            System.out.println("Die Modulo ist: " + ((double)ersteZahl % zweiteZahl));
            break;
        default:
            System.out.println("Ungültige Auswahl.");
        } 
        

        scanner.close ();
    }
}
