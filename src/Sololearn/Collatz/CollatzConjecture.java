package Sololearn.Collatz;
import java.util.Scanner;

public class CollatzConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter any natural number except 1: ");
        if(sc.hasNextInt()) {
            int a = sc.nextInt();
            if(a>1)
                CollatzEngine.CollatzOut(a);
            else
                System.out.println("Sorry, entered value less then or equal to 1.");
        }
        else
            System.out.println("Sorry, entered value isn't integer.");
    }
}