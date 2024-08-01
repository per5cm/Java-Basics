public class App {
    public static void main(String[] args) throws Exception {
       Scanner myScanner = new Scanner(System.in);
       int n;
       StringBuffer sb;
       String choice;

       do {
           System.out.println("Please Enter your shift value: ");
           n = myScanner.nextInt();
           myScanner.nextLine();
       } while (n < 1 || n > 25);

       System.out.println("Please enter your message: ");
       sb = new StringBuffer(myScanner.nextLine());

       do {
           System.out.println("Do you like to encrypt or decrypt message (e/d): ");
           choice = myScanner.nextLine();
       } while (!choice.equals("e") && !choice.equals("d"));

       StringBuffer copy = new StringBuffer();
       copy.append(sb);

       if (choice.equals("e")) {
           for(int i = 0; i < sb.length(); i++) {
            char currentChar = sb.charAt(i);
            if(Character.isLetter(currentChar)){
                char temp = (char) (currentChar+n);
                if((temp > 'Z') && temp < '´' || (temp > 'z')) {
                    
                }
                temp = (char) (temp - 26);
            }
        }
           System.out.println("Encrypt");
       } else {
        if (choice.equals("d")) {
            for(int i = 0; i < sb.length(); i++) {
             char currentChar = sb.charAt(i);
             if(Character.isLetter(currentChar)){
                 char temp = (char) (currentChar+n);
                 if((temp > 'Z') && temp < '´' || (temp > 'z')) {
                     
                 }
                 temp = (char) (temp - 26);
             }
         }
           System.out.println("Decrypt");
       }
    }
}
