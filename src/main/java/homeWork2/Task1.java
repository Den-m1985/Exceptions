package homeWork2;

import java.util.Scanner;

/*
Реализуйте метод, который запрашивает у пользователя ввод
дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

public class Task1 {

    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            while (true) {
                System.out.print("Введите дробное число: ");
                String string = scanner.next();
                if (isFigure(string)) {
                    float figure = StringToFloat(string);
                    System.out.println(figure);
                    break;
                }
            }
            scanner.close();

    }


    static boolean isFigure(String str) {
        if (str == null) {
            return false;
        }
        try {
            StringToFloat(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    static float StringToFloat(String str) {
        if (str.contains(",")) {
            String str2 = str.replace(",", ".");
            return Float.parseFloat(str2);
        }
        return Float.parseFloat(str);
    }

}
