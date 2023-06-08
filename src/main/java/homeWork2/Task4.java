package homeWork2;

import java.util.Scanner;

/*
Разработайте программу, которая выбросит Exception,
когда пользователь вводит пустую строку.
Пользователю должно показаться сообщение,
что пустые строки вводить нельзя.
Далее запросить повторный ввод строки
 */

public class Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.print("Введите строку без пробела: ");
            String string = scanner.nextLine();
            if (!ContainSpace(string)) {
                System.out.println(string);
                break;
            }
        }
        scanner.close();

    }


    static boolean ContainSpace(String str) {
        if (str.contains(" "))
            return true;
        return false;
    }

}
