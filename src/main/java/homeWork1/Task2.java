package homeWork1;

/*
2. Посмотрите на код, и подумайте сколько разных типов исключений вы
тут сможете получить?
public static int sum2d(String[][] arr){
    int sum = 0; for (int i = 0; i < arr.length; i++) {
        for (int j = 0; j < 5; j++) {
            int val = Integer.parseInt(arr[i][j]);
            sum += val;
            }
            }
            return sum;
}
 */
public class Task2 {
    public static void main(String[] args) {
        String[][] arr = {{"d", "2", "3", "4", "5"}, {"6", "7", "8", "9", "10"}};
        System.out.println(sum2d(arr));
    }


    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i].length);
            if (arr[i].length != 5) {
                throw new ArrayIndexOutOfBoundsException("Array length is not 5");
            }
            for (int j = 0; j < 5; j++) {
                String str = arr[i][j];
                if (isInteger(str)) {
                    int val = Integer.parseInt(str);
                    sum += val;
                } else
                    System.out.println();
                throw new NumberFormatException("Array include not digit");
            }
        }
        return sum;
    }

    static boolean isInteger(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (Exception ignored) {
            return false;
        }


    }
}