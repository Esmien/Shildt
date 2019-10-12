package Chapter2;

public class RelLogOps {
    public static void main(String[] args) {
        int i, j;
        boolean b1, b2;
        i = 10;
        j = 11;
        if(i < j) System.out.println("i < j");
        if(i <= j) System.out.println("i <= j");
        if(i != j) System.out.println("i != j");
        if(i == j) System.out.println("i = j"); //не должно вывестись
        if(i >= j) System.out.println("i >= j"); //не должно вывестись
        if(i > j) System.out.println("i > j"); //не должно вывестись

        b1 = true;
        b2 = false;
        if(b1 & b2 == false) System.out.println("b1 & b2 = " + (b1 & b2));
        if(!(b1 & b2)) System.out.println("!(b1 & b2) = true");
        if(b1 | b2) System.out.println("b1 | b2 = true");
        if(b1 ^ b2) System.out.println("b1 ^ b2 = true");
    }
}
