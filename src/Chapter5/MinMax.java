package Chapter5;

public class MinMax {
    public static void main(String args[]) {
        int[] arr = new int[10];
        int min, max;
        for(int i=0; i<10; i++) {
            arr[i] = (int) (Math.random()*1000);
            System.out.println("arr[" + i + "] = " + arr[i]);
        }
        min = max = arr[0];
        for(int i=0; i<10; i++) {
            if(arr[i] < min) min = arr[i];
            if(arr[i] > max) max = arr[i];
        }
        System.out.print("Minimal element's of array value is " + min + "; ");
        System.out.println("Maximal element's of array value is " + max);
    }
}