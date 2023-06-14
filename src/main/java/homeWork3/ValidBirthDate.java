package homeWork3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class ValidBirthDate {


    public String getValidBirthDate(String date) throws ParseException {
        // Проверяем, что строка имеет нужный формат
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        dateFormat.setLenient(false);
        dateFormat.parse(date);
        // Если все ок, возвращаем первоначальную строку
        return date;
    }

}
