package homeWork3;


public class PhoneNumber {

    public String checkNumber(String str) {
        if (str == null) {
            throw new NullPointerException("The number cannot be null");
        }

        String result = null;
        // используем регулярное выражение для удаления знаков, оставляем только цифры
        result = str.replaceAll("[^0-9]", "");


        if (result.length() != 11) {
            throw new RuntimeException("Invalid phone number length");
        }

        if (result.charAt(0) == '7') {
            result = "8" + result.substring(1);
        }

        try {
            //return Long.parseLong(result);
            return result;
        } catch (NumberFormatException e) {
            throw new ArithmeticException("Invalid phone number format");
        }
    }


}
