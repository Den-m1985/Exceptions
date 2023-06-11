package lesson2;

import java.io.FileWriter;
import java.io.IOException;

public class SaveService {

    public void save() throws IOException {
        try (FileWriter writer = new FileWriter("write")) {
            throw new IOException("Operation failed");
        } catch(IOException e){
            System.out.println(e.getMessage());
            throw e;
        }
    }


    public void save2() throws SavedException {
        try (FileWriter writer = new FileWriter("write")) {
            throw new IOException("Operation failed");
        } catch(IOException e){
            System.out.println(e.getMessage());
            throw new SavedException("saved document failed", e);
        }
    }

}
