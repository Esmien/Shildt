package Chapter1;

public class GalToLitTable {
    public static void main(String[] args) {
        double gal, lit;
        int i = 0;
        for(gal = 1; gal <= 100; gal++) {
            lit = gal * 3.7854;
            if(i == 10) {
                System.out.println();
                i = 0;
            }
            System.out.println(gal + " галлонов = " + lit + " литров");
            i++;

        }
    }
}
