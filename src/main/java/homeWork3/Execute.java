package homeWork3;

import homeWork3.fileWrite.WritePeople;

import java.text.ParseException;
import java.util.Scanner;

public class Execute {

    public Execute() {
        String inputString = scanner();

        String[] divideString = divideString(inputString);

        ValidBirthDate validBirthDate = new ValidBirthDate();
        String dateFormat = null;
        try {
            dateFormat = validBirthDate.getValidBirthDate(divideString[3]);
        } catch (ParseException e) {
            System.out.println("Неверный формат даты рождения");
        }

        if (divideString.length == 6) {
            PhoneNumber phoneNumber = new PhoneNumber();
            String phone = phoneNumber.checkNumber(divideString[4]);

            String people = "<" + divideString[0] + "><" + divideString[1] + "><" + divideString[2]
                    + "><" + dateFormat + "><" + phone + "><" + divideString[5] + ">";

            new WritePeople(divideString[0], people);
        }

    }


    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ФИО   дата рождения(dd.mm.yyyy)   номер телефона   пол(m или f): ");
        String string = scanner.nextLine();
        scanner.close();
        return string;
    }


    public static String[] divideString(String str) {
        return str.split(" ");

    }
}
