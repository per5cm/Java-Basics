import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        int yearNr = 0;
        int counter = 0;
        Scanner myScanner = new Scanner(System.in);

        while (counter < 5 ) { 
            do { 
               System.err.println("Please Enter the Number greater as 1582: "); 
               yearNr = myScanner.nextInt();
            } while (yearNr < 1582);
            if ((yearNr%100 == 0) && (yearNr%400 == 0)){
                System.err.println("It is a Leap year!");
            }else if ((yearNr%4 == 0) && (yearNr%100 !=0)){
                System.err.println("It is a Leap year!");
            }else{
                System.err.println("It is not a Leap year!");
            }

            counter++;
        }
        myScanner.close();
    }
}
