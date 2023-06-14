package homeWork3;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class Test {
    public static void main(String[] args) {
        ValidBirthDate validBirthDate = new ValidBirthDate();
        try {
            String date = validBirthDate.getValidBirthDate("25.01.1985");
            System.out.println(date);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }


        PhoneNumber phoneNumber = new PhoneNumber();
        //Long w = phoneNumber.checkNumber("+7 (123) 456-78-90");
        String w = phoneNumber.checkNumber("7123456/78-90");
        System.out.println(w);
    }
}
