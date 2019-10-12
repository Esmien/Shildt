package Chapter5;

public class ArrayDemo {
    public static void main(String[] args) {
        int[] arr = new int[10];
        int i;

        for(i=0; i<10; i++)
            arr[i] = i;
        for(i=0; i<10; i++)
            System.out.println("Element arr[" + i + "]: " + arr[i]);
    }
}
