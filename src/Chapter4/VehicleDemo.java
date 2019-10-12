package Chapter4;

public class VehicleDemo {
    public static void main(String[] args) {
        Vehicle minivan = new Vehicle(7,16,21);
        int range;
        range = minivan.fuelcap * minivan.mpg;
        System.out.println("Minivan can transport " + minivan.passengers + " passengers to " + range + " miles.");
    }
}
