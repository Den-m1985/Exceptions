package homeWork3.execute;

import homeWork3.fileWrite.WritePeople;

import java.util.Scanner;

public class Execute {

    public Execute() {
        String inputString = scanner();

        Analyze analyze = new Analyze();
        String[] divideString = analyze.analyzeInputText(inputString);

        String people = "<" + divideString[0] + "><" + divideString[1] + "><" + divideString[2]
                + "><" + divideString[3] + "><" + divideString[4] + "><" + divideString[5] + ">";

            new WritePeople(divideString[0], people);

    }


    public static String scanner() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите строку: ФИО   дата рождения(dd.mm.yyyy)   номер телефона   пол(m или f): ");
        String string = scanner.nextLine();
        scanner.close();
        return string;
    }


}
