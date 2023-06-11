package seminar3;

public class FileNotExistException extends Exception{
    public FileNotExistException(String message) {
        super(message);
    }

    public FileNotExistException() {
    }
}
