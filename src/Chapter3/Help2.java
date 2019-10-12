package Chapter3;

public class Help2 {
    public static void main(String[] args)
            throws java.io.IOException {
        char choise, ignore;
        do {
            System.out.println("Справка:");
            System.out.println("\t1. if");
            System.out.println("\t2. switch");
            System.out.println("\t3. for");
            System.out.println("\t4. while");
            System.out.println("\t5. do-while");
            System.out.println();
            System.out.print("Выберите: ");

            choise = (char) System.in.read();

            {do ignore = (char) System.in.read();
            while (ignore != '\n');}
        }
        while (choise < '1' | choise > '5');
        switch (choise) {
            case '1':
                System.out.println("Инструкция if:\n");
                System.out.println("if(условие) {");
                System.out.println("\tинструкция1..N;\n}");
                System.out.println("else {");
                System.out.println("\tинструкция1..N;\n\t}");
                break;
            case '2':
                System.out.println("Инструкция switch:\n");
                System.out.println("switch(выражение) {");
                System.out.println("\tcase константа1: ");
                System.out.println("\t\tинструкция1..N;");
                System.out.println("\tbreak;");
                System.out.println("\tcase константа2: ");
                System.out.println("\t\tинструкция1..N;");
                System.out.println("\tbreak;");
                System.out.println("\tcase константаN: ");
                System.out.println("\t\tинструкция1..N;");
                System.out.println("\tbreak;");
                System.out.println("\tdefault:");
                System.out.println("\t\tинструкция1..N;\n\t}");
                break;
            case '3':
                System.out.println("Цикл for:\n");
                System.out.println("for(инициализация; условие; итерация) {");
                System.out.println("\tинструкция1..N;\n\t}");
                break;
            case '4':
                System.out.println("Цикл while:\n");
                System.out.println("while(условие) {");
                System.out.println("\nинструкция1..N;\n\t}");
                break;
            case '5':
                System.out.println("Цикл do-while:\n");
                System.out.println("do {");
                System.out.println("\tинструкция1..N;\n\t}");
                System.out.println("while(условие);");
                break;

        }

    }

}