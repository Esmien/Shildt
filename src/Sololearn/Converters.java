package Sololearn;

public class Converters {
        static void convertToBin(int decimal) {

        int i,j;
        i = decimal;
        j = 1;
        while(Math.abs(i) != 1) {
            j++;
            i /= 2;
        }
        int[] arr = new int[j];

        for(i = decimal, j = 0; i >= 1; i /= 2, j++) {
            arr[j] = i % 2;
        }

        System.out.print("\n" + decimal + "(decimal) is ");
        j = arr.length-1;
        do {
            System.out.print(arr[j]);
            j--;
        } while(j >= 0);
        System.out.println("(binary)");
    }

       static void convertToDecimal(int binary) {
       int[] arr = new int[32];
       int i, j,  decimal;
       int x;
       x = binary;
       decimal = 0;
       for(i = 0; Math.abs(x) > 0; x /=10, i++) {
           arr[i] = x % 10;
       }

       for(i = i, j = 0; i >= 0; i--, j++) {
            decimal += arr[j]*Math.pow(2,j);
        }
        System.out.print(binary + "(binary) is " + decimal + "(decimal)");
       }
}
