package homeWork3.execute;


public class PhoneNumber {

    public String strToNumber(String str) {
        if (str == null) {
            throw new NullPointerException("The number cannot be null");
        }

        // используем регулярное выражение для удаления знаков, оставляем только цифры
        str = strReplace(str);

        if (str.length() != 11) {
            throw new RuntimeException("Invalid phone number length");
        }

        if (str.charAt(0) == '7') {
            str = "8" + str.substring(1);
        }
        return str;
    }


    public static String strReplace(String str){
        return str.replaceAll("[^0-9]", "");
    }


    public boolean isPhoneNumber(String str) {
        // удаляем пробелы и тире, если есть
        str = strReplace(str);
        // проверяем, что длина строки равна 11
        if (str.length() != 11) {
            return false;
        }
        // проверяем, что все символы являются цифрами
        for (char c : str.toCharArray()) {
            if (!Character.isDigit(c)) {
                return false;
            }
        }
        // если все проверки пройдены, то это телефонный номер
        return true;
    }


}
