package data_access;

public class InvalidCsvHeaderException extends RuntimeException{
    public InvalidCsvHeaderException(String message) {
        super(message);
    }
}
