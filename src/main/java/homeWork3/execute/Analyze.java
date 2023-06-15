package homeWork3.execute;

import java.text.ParseException;

public class Analyze {

    public String[] analyzeInputText(String str) {

        if (str.length() < 6)
            throw new RuntimeException("Вы что-то пропустили.");

        String lastName = null;
        String name = null;
        String patronymic = null;
        String dateFormat = "";
        String phone = "";
        String sex = "";

        String[] divideStr = str.split(" ");
        PhoneNumber phoneNumber = new PhoneNumber();

        for (String string : divideStr) {
            if (string.length() == 1) {
                String temp = string.toUpperCase();
                if (temp.equals("M") || temp.equals("F") || temp.equals("М") || temp.equals("Ж")) {
                    sex = temp;
                } else throw new RuntimeException("Неверно написан пол человека");

            } else if (phoneNumber.isPhoneNumber(string)) {
                phone = phoneNumber.strToNumber(string);

            } else if (isOnlyLetters(string) && string.length() > 1) {
                if (lastName == null) {
                    lastName = capitalizeFirstLetter(string);
                } else if (name == null) {
                    name = capitalizeFirstLetter(string);
                } else {
                    patronymic = capitalizeFirstLetter(string);
                }

            } else if (string.matches("\\d{2}\\.\\d{2}\\.\\d{4}")) {
                ValidBirthDate validBirthDate = new ValidBirthDate();
                try {
                    dateFormat = validBirthDate.getValidBirthDate(string);
                } catch (ParseException e) {
                    throw new RuntimeException("Неверный формат даты рождения");
                }
            }
        }

        String[] person = new String[6];
        person[0] = lastName;
        person[1] = name;
        person[2] = patronymic;
        person[3] = dateFormat;
        person[4] = phone;
        person[5] = sex;

        return person;
    }


    public static boolean isOnlyLetters(String str) {
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (!Character.isLetter(c)) {
                return false;
            }
        }
        return true;
    }


    public static String capitalizeFirstLetter(String str) {
        if (str == null || str.isEmpty()) {
            return str;
        }
        return str.substring(0, 1).toUpperCase() + str.substring(1);
    }


}
