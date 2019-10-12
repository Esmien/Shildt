package Sololearn;
import java.util.Scanner;
public class GoldbachsConjecture {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input;

        System.out.print("Input any even natural number: ");
        input = sc.nextInt();
        numberDisintegration(input);
    }

    static void numberDisintegration(int x) {
        int a, b;
        boolean chk = false;
        for(a=1; a<x; a++) {
            for(b=0; b<=a; b++) {
                if(primary(a) && primary(b) && (a+b)==x) {
                    System.out.println(x + " = " + a + " + " + b);
                    chk = true;
                }
            }
        }
        if(!chk)
            System.out.println("Entered number isn't even");
    }

    static boolean primary(int x) {
        for(int i=2; i<x; i++) {
            if(x%i == 0) return false;
        }
        return true;
    }

}
