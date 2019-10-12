package Chapter3;

public class ChangeRegister {
    public static void main(String[] args)
            throws java.io.IOException {
        char input;
        int i = 0;
        do {
            System.out.print("Enter any symbol except point or point to exit program: ");
            input = (char) System.in.read();
            if(input != Changer(input)) i++;
            System.out.println(input + " -> " + Changer(input));
        } while(input != '.');
        System.out.println("Count of changes is " + i);
    }

    static char Changer(char x) {
        if( (x <= 'z') && (x >= 'A') ) {
            if (x < 'a')
                x += 32;
            else
                x -= 32;
        }
        return x;
    }
}