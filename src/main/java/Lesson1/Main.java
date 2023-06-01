package Lesson1;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        System.out.println(getFileSize(new File("fgbfb.txt")));
        System.out.println(divide2(-10, 0));
    }

    public static int divide(int a1, int a2){
        if (a2 == 0)
            return -1;
        return a1/a2;
    }

    public static int divide2(int a1, int a2){
        if (a2 == 0)
            throw new RuntimeException("Divide by zero no permit");
        return a1/a2;
    }

    public static long getFileSize(File file){
        if (!file.exists())
            return -1;
        return file.length();
    }
}
