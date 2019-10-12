package Sololearn.Collatz;

public class CollatzEngine {
    static void CollatzOut(int x) {
        int a = x;
        while(a > 1) {
            if(a%2 == 0)
                System.out.println(a + "/2 = " + (a = a/2));
            else
                System.out.println(a + "*3 + 1 = " + (a = 3*a + 1));

        }
    }
}