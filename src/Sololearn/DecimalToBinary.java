package Sololearn;

import java.util.Scanner;
public class DecimalToBinary
{
    public static void main(String[] args)
            throws java.io.IOException {
        Scanner sc = new Scanner(System.in);
        int dec, bin;
        for(int var = 100; var != 0;) {
            System.out.println("1. Decimal to Binary.");
            System.out.println("2. Binary to Decimal.");
            System.out.println("0. Exit program.");
            System.out.print("Choose type of operation: ");

            var = sc.nextInt();
            if(var == 1) {
                for (int ex = 1; ex != 0; ) {
                    System.out.print("Input any DECIMAL number: ");
                    bin = sc.nextInt();
                    Converters.convertToBin(bin);
                    System.out.println("\nTo exit to menu enter 0, to repeat enter another number: ");
                    ex = sc.nextInt();
                }
            }
            else if(var == 2) {
                for (int ex = 1; ex != 0; ) {
                    System.out.print("Input any BINARY number: ");
                    dec = sc.nextInt();
                    Converters.convertToDecimal(dec);
                    System.out.println("\nTo exit to menu enter 0, to repeat enter another number: ");
                    ex = sc.nextInt();
                }
            }
            else
                System.out.println("Sorry but your choice is incorrect, try again.");
        }

    }

  /*  static void convertToBin(int decemial) {

        int i,j;
        i = decemial;
        j = 1;
        while(Math.abs(i) != 1) {
            j++;
            i /= 2;
        }
        int[] arr = new int[j];

        for(i = decemial, j = 0; i >= 1; i /= 2, j++) {
            arr[j] = i % 2;
        //    if (i == 1)
          //      break;
        }


        System.out.print("\n" + decemial + "(decemial) is ");
        j = arr.length-1;
        do {
            System.out.print(arr[j]);
            j--;
        } while(j >= 0);
        System.out.println("(binary)");
    } */

}