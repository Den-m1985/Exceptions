package lesson2;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Collections;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        String f = null;
        //System.out.println(f.length());

        Object object = new String("123");
        //File file = (File) object;
        //System.out.println(file);

        String str = "123fg";
        //int a = Integer.parseInt(str);
        //System.out.println(a);

        //List<Object> list = Collections.emptyList();
        //list.add("fgb");

        try {
            int a = 10/1;
            String test = null;
            System.out.println(test);
        }catch (ArithmeticException e){
            System.out.println("operation be zero non suported");
        }catch (NullPointerException e){
            System.out.println("Null");
        }catch (Exception e){
            System.out.println("main problem");
        }

        FileReader fileReader = null;
        try {
            fileReader = new FileReader("test.txt");
            fileReader.read();
        }catch (RuntimeException | IOException e){
            System.out.println("catch exseption: " + e.getClass().getSimpleName());
        }finally {
            if (fileReader != null) {
                try {
                    fileReader.close();
                } catch (IOException e) {
                    System.out.println("fileReader not close");
                }
            }
        }


    }
}
