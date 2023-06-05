package seminar1;

import java.util.Scanner;

public class Main1 {
    public static void main(String[] args) {
        int[] array1 = new int[]{1,2};
        int[] array2 = null;
        int[] array3 = new int[] {1,2,3,4,5};
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Введите числе: ");
        int number = iScanner.nextInt();
        check(test(array1, number));
        check(test(array2, number));
        check(test(array3, number));
    }

    public static void check(int code){
        switch (code) {
            case -1:
                System.out.println("Массив меньше заданной длины");
                break;
            case -2:
                System.out.println("Элемент не найден");
                break;
            case -3:
                System.out.println("Пустой массив");
                break;
            default:
                System.out.println("Индекс элемента: " + code);
        }


    }

    public static int test(int[] array, int number){
        int minSize = 3;
        if(array == null){
            return -3;
        }
        if(array.length < minSize){
            return -1;
        }
        for (int i = 0; i < array.length; i++) {
            if(array[i] == number){
                return i;
            }
        }
        return -2;
    }
}
