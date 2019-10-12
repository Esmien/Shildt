package Chapter2;

public class ModDemo {
    public static void main(String[] args) {
        int iresult, irem;
        double dresult, drem;
        iresult = 10 / 3;
        irem = 10 % 3;

        dresult = 10.0 / 3.0;
        drem = 10.0 % 3.0;

        System.out.println("10 dev 3 = " + iresult + "\t10 mod 3 = " + irem);
        System.out.println("10.0 dev 3.0 = " + dresult + "\t10.0 mod 3.0 = " + drem);
    }
}
