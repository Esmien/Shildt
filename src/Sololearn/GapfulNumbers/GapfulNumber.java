package Sololearn.GapfulNumbers;
import java.util.Scanner;
public class GapfulNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;
        System.out.print("Input any 3- or more digits number: ");
        input = sc.nextInt();
        if( (input/100) != 0) {
            if (GapfulCheck.Gapful(input))
                System.out.println(input + " is gapeful number.");
            else
                System.out.println(input + " isn't gapeful number.");
        }
        else
            System.out.println(input + " less then 3-digits number.");
        }
    }

