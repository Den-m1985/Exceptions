package seminar3;

public class MyArraySizeException extends Exception{

    public MyArraySizeException() {
        this("Неверный размер массива");
    }

    public MyArraySizeException(String message) {
        super(message);
    }
}
