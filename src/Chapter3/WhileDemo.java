package Chapter3;

public class WhileDemo {
    public static void main(String[] args) {
        char ch = 'A';
        int i = 1;
        while(ch <= 'z') {
            if(ch <= 'Z' || ch >= 'a') {
                System.out.print(ch + "\t");
                if (ch == 'Z' || i == 7) {
                    System.out.println();
                    i = 0;
                }
                i++;
            }
            ch++;
        }
    }
}
