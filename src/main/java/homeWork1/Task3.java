package homeWork1;
/*
3. Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
и возвращающий новый массив, каждый элемент которого равен частному элементов
двух входящих массивов в той же ячейке. Если длины массивов не равны,
необходимо как-то оповестить пользователя. Важно: При выполнении метода
единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше
 */

public class Task3 {
    public static void main(String[] args) {
        int[] a = new int[]{1, 2, 3};
        int[] b = new int[]{4, 5, 6, 6, 5, 8};
        int[] c = arrays(a, b);
        for (int digit : c) {
            System.out.println(digit + " ");
        }

    }

    public static int[] arrays(int[] a, int[] b) {
        int lengthA = a.length;
        int[] c = new int[lengthA];
        if (lengthA == b.length) {
            for (int i = 0; i < lengthA; i++) {
                c[i] = a[i] / b[i];
            }
        } else
            throw new RuntimeException("Arrays are not the same length");
        return c;
    }
}
