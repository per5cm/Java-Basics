import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bitte erste Zahl eingeben: ");
        int ersteZahl = scanner.nextShort();

        System.out.print("Bitte zweite Zahl eingeben: ");
        int zweiteZahl = scanner.nextShort();

        System.out.println("Die Addition ist: " + (ersteZahl + zweiteZahl));
        System.out.println("Die Differenz ist: " + (ersteZahl - zweiteZahl));
        System.out.println("Die Multiplikation ist: " + (ersteZahl * zweiteZahl));
        if (zweiteZahl !=0) {
            System.out.println("Die Division ist: " + ((double)ersteZahl / zweiteZahl));
        } else {
            System.out.println("Fehler: Division durch '0' nicht möglich!");
        } 
        System.out.println("Die Modulo ist: " + (ersteZahl % zweiteZahl));

        scanner.close ();
    }
}
