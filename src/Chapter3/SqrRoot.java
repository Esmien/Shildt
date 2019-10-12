package Chapter3;

public class SqrRoot {
    public static void main(String[] args) {
        double num, sroot, rerr;
        for(num = 1.0; num < 100.0; num++) {
            sroot = Math.sqrt(num);
            rerr = num - sroot*sroot;
            System.out.println("sqrt(" + num + ") = " + sroot + "; погрешность = " + rerr);
        }
    }
}
