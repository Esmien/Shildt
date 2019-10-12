package Sololearn.GapfulNumbers;
import java.util.Scanner;

public class GapfulNumberOfRange {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b, chng;
        int j;

        System.out.print("Enter range of at least 3-digits numbers, sample \'100 999\':");
        a = sc.nextInt();
        b = sc.nextInt();
        j = 0;
        if(a<b) {
            chng = a;
            a = b;
            b = chng;
        }
        for(int i=a; i<=b; i++) {
            if(GapfulCheck.Gapful(i)) {
                System.out.print(i + "\t");
                j++;
                if ((j % 10) == 0)
                    System.out.println("\n");
            }
        }
    }
}

