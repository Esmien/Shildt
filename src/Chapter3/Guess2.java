package Chapter3;

public class Guess2 {
    public static void main(String[] args)
    throws java.io.IOException {
        char ch, answer = 'K';

        System.out.println("Загадана буква A-Z.");
        System.out.print("Гадай: ");
        ch = (char) System.in.read();
        if (ch == answer)
            System.out.println("Excellent! Exactly!");
        else System.out.println("Sorry... Try again");
    }
}
