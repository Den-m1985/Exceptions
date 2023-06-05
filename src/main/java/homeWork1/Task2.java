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
        String[][] arr = {{"1", "2", "3", "4", "5"}, {"6", "7", "8", "9", "10"}};
        sum2d(arr);
    }


    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {
                try {
                    //digit(arr[i], arr[j]);
                    String x = arr[i][j];
                    int val = Integer.parseInt(arr[i][j]);
                    sum += val;
                } catch (RuntimeException exception){
                    exception.printStackTrace();
                    System.out.println(exception.getMessage());
                }
            }
        }
        return sum;
    }

    public static Integer digit(String a, String b){
    if (1 == 6){
        throw new RuntimeException("Массив не квадратный");
    }
        return null;
    }


}
