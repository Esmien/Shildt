package Sololearn;
import java.util.Scanner;

public class GrishasPrimary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        VladsSolution.primary(input);

    }
}

class VladsSolution {
    static void primary(int x) {
        int i, p;
        p = 0;
        for(i = 2; i <= x; i++) {
            if((x % i) == 0) p++;
        }
        if(p > 1) System.out.println("Not primary number");
        else System.out.println("Primary number");
    }
}