package Sololearn.LabNumbers;
import java.util.Scanner;

public class RangeOfLabNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int chng;

        System.out.print("Enter range of natural numbers, for example \'2 100\': ");
        if(sc.hasNextInt()) {
            int a = sc.nextInt();
            int b = sc.nextInt();
            if(a>=0 && b>=0) {
                if (a > b) {
                    chng = a;
                    a = b;
                    b = chng;
                }

                for (int i = a; i <= b; i++) {
                    System.out.println("Check for " + i + ": " + CheckLabNumbers.checkNumber(i));
                }
            }
            else
                System.out.println("Sorry, but any of entered numbers has value less of 0.");
        }
        else
            System.out.println("Sorry, but any of entered values isn't integer.");
    }
}
