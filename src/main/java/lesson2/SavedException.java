package lesson2;

import java.io.IOException;

public class SavedException extends IOException {
    public SavedException(String message, Exception e){
        super(message, e);
    }
}
