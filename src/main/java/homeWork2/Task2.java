package homeWork2;

/*
Если необходимо, исправьте данный код
(задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
 */
public class Task2 {
    public static void main(String[] args) {

        try {
            int d = 0;
            int[] intArray = new int[]{5, 5, 6, 6, 65};  // инициализировал переменную
            int index = 8;
            if (intArray.length > index) {
                double catchedRes1 = intArray[index] / d;
                System.out.println("catchedRes1 = " + catchedRes1);
            }else throw new IndexOutOfBoundsException("Длина массива меньше запрашиваемого индекса");
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }


    }
}
