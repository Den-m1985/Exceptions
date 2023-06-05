package seminar1;

public class Main2 {
    /*
    Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив.
    Необходимо посчитать и вернуть сумму элементов этого массива.
    При этом накладываем на метод 2 ограничения:
    метод может работать только с квадратными массивами (кол-во строк = кол-ву столбцов),
    и в каждой ячейке может лежать только значение 0 или 1.
    Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке.
     */
    public static void main(String[] args) {
        int[][] array = new int[][]{{1, 0, 1}, {0, 0, 5}, {1, 1, 1}};
        try {
            int res = sum(array);
            System.out.println("Длина массива равна: " + res);
        } catch (RuntimeException exception){
            exception.printStackTrace();
            System.out.println(exception.getMessage());
        }
        System.out.println("Конец работы");
    }

    static int sum(int[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr.length != arr[i].length) {
                throw new RuntimeException("Массив не квадратный");
            }
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] != 0 && arr[i][j] != 1) {
                    throw new RuntimeException("Элемент с индексами [" + i + ", " + j + "] " +
                            "не ваен 1 или 0");
                }
                sum += arr[i][j];
            }
        }
        return sum;
    }
}
