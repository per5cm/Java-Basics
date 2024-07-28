import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Would you like to encrypt or decrypt a message? (e/d): ");
        String choice = scanner.nextLine().toLowerCase();

        System.out.print("Enter the shift value: ");
        int shift = scanner.nextInt();
        scanner.nextLine(); 

        System.out.print("Enter your message: ");
        String message = scanner.nextLine();

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

