package Chapter4;

public class Vehicle {
    int passengers;
    int fuelcap;
    int mpg;

    Vehicle(int p, int f, int m) {
        passengers = p;
        fuelcap = f;
        mpg = m;
    }

    void rangeV() {
        System.out.println("Range is " + fuelcap*mpg + " miles.");
    }

    int range() {
        return fuelcap*mpg;
    }

    double fuelneeded(int miles) {
        return (double) miles/mpg;
    }


}
