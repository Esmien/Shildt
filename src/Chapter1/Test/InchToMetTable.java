package Chapter1.Test;

public class InchToMetTable {
    public static void main(String[] args) {
        double inch, met;
        int i, j = 0;
        met = 1;
        for(i = 1; i <= 144; i = i + 2) {
            if(j == 12) {
                System.out.println();
                j = 0;
            }
            inch = met / 39.37 * i;
            System.out.println("В " + i + " дюймов " + inch + " метров");
            j = j +2;
        }
    }
}
