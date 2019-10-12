package Chapter3;

public class Help {
    public static void main(String[] args)
    throws java.io.IOException {
        char choise;

        System.out.println("Справка:");
        System.out.println("\t1. if");
        System.out.println("\t2. switch");
        System.out.print("Выберите: ");

        choise = (char) System.in.read();

        switch (choise) {
            case '1':
                System.out.println("Инструкция if:\n");
                System.out.println("if(условие) инструкция;");
                System.out.println("else инструкция;");
            break;
            case '2':
                System.out.println("Инструкция switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println("\tcase константа1: ");
                System.out.println("\t\tинструкция1;");
                System.out.println("\t\tинструкция2;");
                System.out.println("\t\tинструкцияN;");
                System.out.println("\tbreak;");
                System.out.println("\tcase константа2: ");
                System.out.println("\t\tинструкция1;");
                System.out.println("\t\tинструкция2;");
                System.out.println("\t\tинструкцияN;");
                System.out.println("\tbreak;");
                System.out.println("\tcase константаN: ");
                System.out.println("\t\tинструкция1;");
                System.out.println("\t\tинструкция2;");
                System.out.println("\t\tинструкцияN;");
                System.out.println("\tbreak;");
                System.out.println("\tdefault:");
                System.out.println("\t\tинструкция1..N");
                System.out.println("}");
            break;
            default:
                System.out.println("Запрос не найден.");

        }

    }

}
