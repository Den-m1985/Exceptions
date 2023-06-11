package seminar3;

import lesson3.FileNotExistException;
import lesson3.NullObjectException;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class Ex4 {
    /*
    1. Создайте класс исключения, который будет выбрасываться при делении на 0.
    Исключение должно отображать понятное для пользователя сообщение об ошибке.

    2. Создайте класс исключений, которое будет возникать при обращении к пустому элементу
    в массиве ссылочного типа. Исключение должно отображать понятное для
    пользователя сообщение об ошибке

    3. Создайте класс исключения, которое будет возникать при попытке открыть
    несуществующий файл. Исключение должно отображать понятное для пользователя сообщение
    об ошибке.
     */
    public static void main(String[] args) {
        try {
            test();
            test2();
            test3();
        } catch (DivideByZeroException | NullObjectException | FileNotExistException e) {
            e.printStackTrace();
        }
    }

    public static void test() throws DivideByZeroException{
        System.out.println("Начало работы");
        int a = 10;
        int b = 1;
        try {
            int c = a / b;
        } catch (ArithmeticException e){
            throw new DivideByZeroException(e);
        }
    }

    public static void test2() throws NullObjectException{
        String[] strings = new String[5];
        try {
//            strings[0].length();
        } catch (NullPointerException e){
            throw new NullObjectException("Обращение к пустому элементу");
        }
    }

    public static void test3() throws FileNotExistException {
        try {
            FileReader reader = new FileReader("ttt.txt");
        } catch (FileNotFoundException e) {
            throw new FileNotExistException("Файл не найден");
        }
    }
}
