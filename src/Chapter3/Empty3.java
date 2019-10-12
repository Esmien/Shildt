package Chapter3;

public class Empty3 {
    public static void main(String[] args) {
        int i;
        int sum = 1;
        int j = 5;
        for(i = 1; i <= j; sum *= i++);
        System.out.println("Сумма 1.." + j + " = " + sum);
    }
}
