package homeWork3.fileWrite;

import java.io.FileWriter;
import java.io.IOException;

public class WriteTXT {
    public WriteTXT(String downloadsPath, String person) {
        try (FileWriter writer = new FileWriter(downloadsPath, true)) {
            writer.write(person);
            writer.write("\n");
        } catch (IOException e) {
            System.out.println("Ошибка при записи данных в файл.");
            e.printStackTrace();
        }
    }


}
