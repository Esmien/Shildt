package Sololearn.Scrabble;

public class Score {
    static String expressionScore(String str) {
        String[] words = str.split("\\s");
        int[] scoreOfExpression = new int[words.length];
        int max = 0;
        String found = null;

        for(int i=0; i<words.length; i++) {
            if (words[i].length() > 10)
                return "Sorry, but \"" + words[i] + "\" has more then 10 letters";
            scoreOfExpression[i] = wordScore(words[i]);
            if (max < scoreOfExpression[i])
                max = scoreOfExpression[i];
        }
                for (int i = 0; i < scoreOfExpression.length; i++) {
                    if (max == scoreOfExpression[i])
                        found = words[i];
            }
        return "\"" + found + "\" win!";
    }

    static int wordScore(String str) {
        int scoreOfWord = 0;
        char[] letters = str.toCharArray();
        for(int i=0; i<letters.length; i++) {
            switch(letters[i]) {
                case 'e':
                case 'a':
                case 'i':
                case 'o':
                case 'n':
                case 'r':
                case 't':
                case 'l':
                case 's':
                case 'u':
                    scoreOfWord += 1;
                    break;
                case 'd':
                case 'g':
                    scoreOfWord += 2;
                    break;
                case 'b':
                case 'c':
                case 'm':
                case 'p':
                    scoreOfWord += 3;
                    break;
                case 'f':
                case 'h':
                case 'v':
                case 'w':
                case 'y':
                    scoreOfWord += 4;
                    break;
                case 'k':
                    scoreOfWord += 5;
                    break;
                case 'j':
                case 'x':
                    scoreOfWord += 8;
                    break;
                case 'q':
                case 'z':
                    scoreOfWord += 10;
                    break;
            }
        }
        return scoreOfWord;
    }
}
