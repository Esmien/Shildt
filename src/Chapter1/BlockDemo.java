package Chapter1;

public class BlockDemo {
    public static void main(String[] args) {
        float d, i, j;
        i = 5;
        j = 10;
        if(i != 0) {                                    //Если i не равно 0
            System.out.println("i != 0");               //Вывести на экран i != 0
            d = j / i;
            System.out.println("j / i = " + d);         //Вывести на экран j / i = 2
        }
    }
}
