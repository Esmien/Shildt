package Chapter3;

public class KbIn {
    public static void main(String[] args)
        throws java.io.IOException {

        char ch;
        System.out.println("Press any button:");
        ch = (char) System.in.read();
        System.out.println("Pressed \"" + ch + "\" key");
    }
}
