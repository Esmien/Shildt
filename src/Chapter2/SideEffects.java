package Chapter2;

public class SideEffects {
    public static void main(String[] args) {
        int i = 0;
        if(false & (++i < 100))
            System.out.println("Ничего не будет выведено");
        System.out.println("Однако, \"if\" выполняется: i = " + i);
        if(false && (++i < 100))
            System.out.println("До сих пор ничего нет");
        System.out.println("А теперь \"if\" не выполняется до конца! i по прежнему равно " + i);
    }
}
