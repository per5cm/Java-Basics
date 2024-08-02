import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int n;
        StringBuffer sb;
        String auswahl;
        Scanner meinScanner = new Scanner(System.in);

        do {
            System.out.println("Bitte geben Sie ihren Schlüssel ein: ");
            n = meinScanner.nextInt();
            meinScanner.nextLine();
        } while (n < 1 || n > 25);

        System.out.println("Bitte geben Sie Ihren Zeichenkette ein: ");
        sb = new StringBuffer(meinScanner.nextLine());

        do {
            System.out.println("Moechten Sie die Zeichenkette verschluesseln (ver) oder entschluesseln (ent)?");
            auswahl = meinScanner.nextLine();
        } while (!auswahl.equals("ver") && !auswahl.equals("ent"));

        StringBuffer kopie = new StringBuffer();
        kopie.append(sb);

        if (auswahl.equals("ver")) {
            for (int i = 0; i < sb.length(); i++) {
                char aktuellerChar = sb.charAt(i);
                if (Character.isLetter(aktuellerChar)) {
                    char temp = (char) (aktuellerChar + n);
                    if ((temp > 'Z') && temp < '`' || (temp > 'z')) {
                        temp = (char) (temp - 26);
                    }
                    kopie.setCharAt(i, temp);
                }
            }
        } else {
            for (int i = 0; i < sb.length(); i++) {
                char aktuellerChar = sb.charAt(i);
                if (Character.isLetter(aktuellerChar)) {
                    char temp = (char) (aktuellerChar - n);
                    if ((temp < 'A') || (temp < 'a' && temp > '[')) {
                        temp = (char) (temp + 26);
                    }
                    kopie.setCharAt(i, temp);
                }
            }
        }

        if (auswahl.equals("ver")) {
            System.out.println("Text verschlüsselt: " + kopie);
            System.out.println("Text unverschlüsselt: " + sb);
        } else {
            System.out.println("Text unverschlüsselt: " + kopie);
            System.out.println("Text verschlüsselt: " + sb);
        }
        meinScanner.close();
    }
}
