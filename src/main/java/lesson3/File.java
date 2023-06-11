package lesson3;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class File {
    public static void main(String[] args) {

        try ( FileReader fileReader1 =  new FileReader("test.txt")) {
            fileReader1.read();
        }catch (RuntimeException | IOException e){
            System.out.println("catch exseption: " + e.getClass().getSimpleName());
        }


        // копируем из одного в другой файл
        try ( FileReader fileReader2 =  new FileReader("test.txt");
        FileWriter writer = new FileWriter("write")) {
            while (fileReader2.ready())
                writer.write(fileReader2.read());
        }catch (RuntimeException | IOException e){
            System.out.println("catch exseption: " + e.getClass().getSimpleName());
        }
        System.out.println(" Copy successfully");


        try {
            System.out.println("Some code");
        }finally {
            System.out.println("Code necessary to do");
        }

    }
}
