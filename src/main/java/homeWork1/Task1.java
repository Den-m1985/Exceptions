package homeWork1;

/*
1. Реализуйте 3 метода, чтобы в каждом из них получить разные исключения
 */
public class Task1 {
    public static void main(String[] args) {
        int digit = 6;
        method1(digit);
        method2(digit);
        method3(digit);
    }


    public static void method1(int digit) {
        if (digit != 5)
            throw new RuntimeException("Digit: " + digit + " is not equal 5");
    }

    public static void method2(int digit) {
        if (digit == 5)
            throw new RuntimeException("Digit: " + digit + " is equal 5");
    }

    public static void method3(int digit) {
        if (digit > 5)
            throw new RuntimeException("Digit: " + digit + " is more than 5");
    }
}
