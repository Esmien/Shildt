package Chapter2;

public class UseCast {
    public static void main(String[] args) {
        int i;
        for(i = 0; i < 5; i++){
            System.out.println(i + "/3 = " + i / 3);
            System.out.println(i + "/3(с дробью) = " + (double) i / 3);
        }
    }
}