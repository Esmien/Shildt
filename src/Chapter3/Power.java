package Chapter3;

public class Power {
    public static void main(String[] args) {
        int e, result;
        for(int i = 0; i < 10; i++) {
            e = i;
            result = 1;
            while (e > 0) {
                result *= 2;
                e--;
            }
            System.out.println("2^" + i + " = " + result);
        }
    }
}
