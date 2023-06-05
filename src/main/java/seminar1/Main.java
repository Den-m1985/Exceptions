package seminar1;

public class Main {
    /*
    Реализуйте метод, принимающий в качестве аргумента целочисленный массив.
    Если длина массива меньше некоторого заданного минимума, метод возвращает -1,
    в качестве кода ошибки, иначе - длину массива.
     */
    public static void main(String[] args) {
        int[] arr = new int[]{1,2,3};
        int res = test(arr);
        if (res == -1){
            System.out.println("Длина массива меньше необходимого минимума");
        } else {
            System.out.println("Длина массива равна: " + res);
        }
    }

    static int test(int[] arr){
        int minSize = 4;
        if (arr.length < minSize){
            return -1;
        }
        return arr.length;
    }
}