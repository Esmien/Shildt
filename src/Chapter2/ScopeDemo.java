package Chapter2;

public class ScopeDemo {
    public static void main(String[] args) {
        int x = 10;
        if(x == 10) {
            int y = 20;
            System.out.println("x = " + x + "\ny = " + y);
            x = 2*y;
        }
       // y = 100;
        System.out.println("x = " + x);
        
    }
}
