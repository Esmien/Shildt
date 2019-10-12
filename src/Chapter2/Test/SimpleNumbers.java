package Chapter2.Test;

public class SimpleNumbers {
    public static void main(String[] args) {
        int i,j;
        boolean ost;
        for(i = 2; i < 100; i++){
            ost = true;
            for(j = 2; j <= i/j; j++) {
                if ((i % j) == 0) ost = false; //проверка на остаток, если нет остатка - смена значения "ost"
            }
            if(ost == true) System.out.println(i + " ");
            }
        }
}
