package Chapter4;

public class AddMeth {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7,16,21);
        Vehicle sportscar = new Vehicle(2,14,12);

        int range1, range2;

        System.out.print("Minivan can transport " + minivan.passengers + " passengers. ");
        minivan.rangeV();
        System.out.print("Sportscar can transport " + sportscar.passengers + " passengers. ");
        sportscar.rangeV();
    }
}
