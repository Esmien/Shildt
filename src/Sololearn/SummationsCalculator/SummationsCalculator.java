package Sololearn.SummationsCalculator;
import java.util.Scanner;

public class SummationsCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        String expression;

        System.out.print("Enter range of summations and expression separated by space, for example \'2 4 *2\' : ");
        if(sc.hasNextInt()) {
            a = sc.nextInt();
            b = sc.nextInt();
        }
        else {
            System.out.println("Entered range isn't integer range.");
            return;
        }
            expression = sc.next();
            System.out.println(SummationsEngine.summations(a, b, expression));
    }
}

