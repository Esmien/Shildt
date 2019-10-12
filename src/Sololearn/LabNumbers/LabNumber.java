package Sololearn.LabNumbers;
import java.util.Scanner;

public class LabNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any natural number: ");
        if(sc.hasNextInt()) {
            int num = sc.nextInt();
            if(num > 0)
                System.out.println(CheckLabNumbers.checkNumber(num));
            else
                System.out.println(num + " isn't natural number but result of check for " + (-num) + " is " + CheckLabNumbers.checkNumber(num));
        }
        else
            System.out.println("Sorry, but entered value isn't integer.");
    }
}
