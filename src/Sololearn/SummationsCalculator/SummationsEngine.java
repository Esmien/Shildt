package Sololearn.SummationsCalculator;

public class SummationsEngine {
    static int summations(int a, int b, String e) {
        int summ = 0;
        char[] ch = e.toCharArray();
        char exp = ch[0];
        String numberS = "";
        for(int i = 1; i<ch.length; i++)
            numberS += ch[i];
        int number = Integer.parseInt(numberS);

        for(int i=a; i<=b; i++) {
            switch(exp) {
                case '+':
                    summ += (i+number);
                    break;
                case '-':
                    summ += (i-number);
                    break;
                case '*':
                    summ += (i*number);
                    break;
                case '/':
                    summ += (i/number);
                    break;
                case '%':
                    summ += (i%number);
                    break;
            }
        }
        return summ;
    }
}