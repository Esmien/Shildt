package Chapter3;

public class Guess4 {
    public static void main(String[] args)
    throws java.io.IOException {
        char ch, ignore, answer;
        answer = 'Y';
        do {
            System.out.println("Made up letter from A to Z.");
            System.out.println("Try guess this letter: ");
            ch = (char) System.in.read();

            do {
                ignore = (char) System.in.read();
            } while (ignore != '\n');

            if (ch == answer) {
                System.out.println("Congratulations! You guessed the hidden letter!");
            } else {
                System.out.println("Sorry... Hidden letter closer to ");
                if (ch < answer)
                    System.out.println("end of Alphabet");
                else
                    System.out.println("begin of Alphabet");
                System.out.println("Try again.\n");
            }
        }
        while (ch != answer);
            }

}
