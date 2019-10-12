package Sololearn.Scrabble;
import java.util.Scanner;

public class Scrabble {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String expr;

        System.out.print("Enter some expression but max length of every word can't be more 10 letters: ");
        expr = sc.nextLine();
        System.out.println(Score.expressionScore(expr));
    }
}