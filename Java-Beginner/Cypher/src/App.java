import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n;
        
        // do while method when n is less than 1, while n is greater than 25.
        do {
            System.out.print("Enter a number from 1 to 25: ");
            n = scanner.nextInt();
        } while (n < 1 || n > 25);
        scanner.nextLine();

        // shift value and your message
        System.out.print("Would you like to encrypt or decrypt a message? (e/d): ");
        String choice = scanner.nextLine().toLowerCase();
        

        System.out.print("Enter the shift value: ");
        int shift = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter your message: ");
        String message = scanner.nextLine();
        

        // choice if e pressed else if d
        if (choice.equals("e")) {
            String encryptedMessage = encrypt(message, shift);
            System.out.println("Encrypted message: " + encryptedMessage);
        } else if (choice.equals("d")) {
            String decryptedMessage = decrypt(message, shift);
            System.out.println("Decrypted message: " + decryptedMessage);
        } else {
            System.out.println("Invalid choice.");
        }

        scanner.close();
    }
    // ceasars cypher starts here.
    public static String encrypt(String message, int shift) {
        StringBuilder encryptedMessage = new StringBuilder();

        for (int i = 0; i < message.length(); i++) {
            char c = message.charAt(i);

            if (Character.isLetter(c)) {
                char base = Character.isLowerCase(c) ? 'a' : 'A';
                c = (char) ((c - base + shift) % 26 + base);
            }

            encryptedMessage.append(c);
        }
        return encryptedMessage.toString();
    }

    public static String decrypt(String message, int shift) {
        return encrypt(message, 26 - shift);
    }
}

