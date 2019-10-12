package Chapter4;

public class RetMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportscar = new Vehicle(2,14,12);

        int range1, range2;

        range1 = minivan.range();
        range2 = sportscar.range();

        System.out.println("Minivan can transport " + minivan.passengers + " passengers to " + range1 + " miles.");
        System.out.println("Sportscar can transport " + sportscar.passengers + " passengers to " + range2 + " miles.");


    }
}
