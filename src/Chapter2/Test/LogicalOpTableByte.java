package Chapter2.Test;

public class LogicalOpTableByte {
    public static void main(String[] args) {
        boolean p, q;
        byte P, Q, PAndQ, POrQ, NotP, PXorQ;

        System.out.println("P\tQ\tAND\tOR\tXOR\tNOT");

        p = true;
        q = true;
        /* System.out.print(p + "\t" + q + "\t");
        System.out.print( (p & q) + "\t" + (p | q) + "\t");
        System.out.println( (p ^ q) + "\t" + (!p) ); */
        {
            if (p == true)
                P = 1;
            else P = 0;
            if (q == true)
                Q = 1;
            else Q = 0;
            if ((p & q) == true)
                PAndQ = 1;
            else PAndQ = 0;
            if ((p | q) == true)
                POrQ = 1;
            else POrQ = 0;
            if ((p ^ q) == true)
                PXorQ = 1;
            else PXorQ = 0;
            if ((!p) == true)
                NotP = 1;
            else NotP = 0;
        }

        System.out.print(P + "\t" + Q + "\t");
        System.out.print(PAndQ + "\t" + POrQ + "\t");
        System.out.println(PXorQ + "\t" + NotP);

        p = true;
        q = false;
        /* System.out.print(p + "\t" + q + "\t");
        System.out.print( (p & q) + "\t" + (p | q) + "\t");
        System.out.println( (p ^ q) + "\t" + (!p) ); */
        {
            if (p == true)
                P = 1;
            else P = 0;
            if (q == true)
                Q = 1;
            else Q = 0;
            if ((p & q) == true)
                PAndQ = 1;
            else PAndQ = 0;
            if ((p | q) == true)
                POrQ = 1;
            else POrQ = 0;
            if ((p ^ q) == true)
                PXorQ = 1;
            else PXorQ = 0;
            if ((!p) == true)
                NotP = 1;
            else NotP = 0;
        }


        System.out.print(P + "\t" + Q + "\t");
        System.out.print(PAndQ + "\t" + POrQ + "\t");
        System.out.println(PXorQ + "\t" + NotP );

        p = false; q = true;
        /* System.out.print(p + "\t" + q + "\t");
        System.out.print( (p & q) + "\t" + (p | q) + "\t");
        System.out.println( (p ^ q) + "\t" + (!p) ); */
        {
            if (p == true)
                P = 1;
            else P = 0;
            if (q == true)
                Q = 1;
            else Q = 0;
            if ((p & q) == true)
                PAndQ = 1;
            else PAndQ = 0;
            if ((p | q) == true)
                POrQ = 1;
            else POrQ = 0;
            if ((p ^ q) == true)
                PXorQ = 1;
            else PXorQ = 0;
            if ((!p) == true)
                NotP = 1;
            else NotP = 0;
        }

        System.out.print(P + "\t" + Q + "\t");
        System.out.print(PAndQ + "\t" + POrQ + "\t");
        System.out.println(PXorQ + "\t" + NotP );

        p = false; q = false;
        /* System.out.print(p + "\t" + q + "\t");
        System.out.print( (p & q) + "\t" + (p | q) + "\t");
        System.out.println( (p ^ q) + "\t" + (!p) ); */
        {
            if (p == true)
                P = 1;
            else P = 0;
            if (q == true)
                Q = 1;
            else Q = 0;
            if ((p & q) == true)
                PAndQ = 1;
            else PAndQ = 0;
            if ((p | q) == true)
                POrQ = 1;
            else POrQ = 0;
            if ((p ^ q) == true)
                PXorQ = 1;
            else PXorQ = 0;
            if ((!p) == true)
                NotP = 1;
            else NotP = 0;
        }

        System.out.print(P + "\t" + Q + "\t");
        System.out.print(PAndQ + "\t" + POrQ + "\t");
        System.out.println(PXorQ + "\t" + NotP );

    }
}
