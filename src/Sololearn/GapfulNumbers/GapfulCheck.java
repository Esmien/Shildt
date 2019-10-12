package Sololearn.GapfulNumbers;

public class GapfulCheck {
    static boolean Gapful(int x) {
        int first, end, chk;
        first = x;
        end = x % 10;
        while (first/10 != 0) {
            first /= 10;
        }
        chk = first*10 + end;
        if(x%chk == 0)
            return true;
        return false;
    }
}
