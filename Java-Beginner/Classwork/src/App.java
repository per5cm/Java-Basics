import java.util.*;

public class App {
    
    public static void main(String[] args) throws Exception {
        Scanner inputScanner = new Scanner(System.in);

        System.out.println("Zufallszahl: " + Aufgabe1(8));
        System.out.println("Character: " + Aufgabe2('R', 'G', 'B', 'X'));

        System.out.println("Bitte eingeben erste zahl: ");
        int zahl1 = inputScanner.nextInt();
        System.out.println("Bitte eingeben zweite zahl: ");
        int zahl2 = inputScanner.nextInt();
        System.out.println("Bitte eingeben drite zahl: ");
        int zahl3 = inputScanner.nextInt();

        System.out.println("Durschnit: " + Aufgabe3(zahl1, zahl2, zahl3));
        inputScanner.close();
    }

    private static int Aufgabe1(int zahl){
        
        int a = 87;
        int b = 877;
        final int m = 24; 

        int zufallZ = (a * zahl + b) % m;
        return zufallZ;
    }
    private static int Aufgabe2(char c1, char c2, char c3, char c4) {


        final int m = 69;
        int result = (c1 + c2 + c3 + c4) % m;
        return result;
        
    }

    private static float Aufgabe3(int zahl1, int zahl2, int zahl3){
        return (zahl1 + zahl2 + zahl3) / 3;
    }
}