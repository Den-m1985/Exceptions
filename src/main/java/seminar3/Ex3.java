package seminar3;

import java.io.IOException;

public class Ex3 {
    public static void main(String[] args) {
        try (Counter counter = new Counter()){
            counter.add();
            counter.add();
            System.out.println("считаю");
            System.out.println(counter.getCounter());
        } catch (IOException e){
            System.out.println(e.getMessage());
        }
        System.out.println("конец блока try-catch");
    }
}
