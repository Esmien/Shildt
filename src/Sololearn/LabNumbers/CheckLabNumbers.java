package Sololearn.LabNumbers;

public class CheckLabNumbers {
    static boolean checkNumber(int x) {
        for(int i=2; i<=Math.abs(x/2); i++) {
            if(primary(i) && (x%i == 0) && (x % (i*i) == 0))
                return true;
        }
        return false;
    }

    static boolean primary(int x) {
        for(int i=2; i<=x/2; i++) {
            if(x%i == 0) return false;
        }
        return true;
    }

}
