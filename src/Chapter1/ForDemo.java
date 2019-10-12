package Chapter1;

public class ForDemo {
    public static void main(String[] args) {
        int count;
        for(count = 0; count < 5; count++)   //присваиваем значение счетчтику 0, проверяем выполнение условия счетчик<5, увеличиваем счетчик на 1
            System.out.println("Значение счетчика = " + count); //выводим значение счетчика
        System.out.println("Готово!");
    }
}
