package seedu.duke.exception;

public class InvalidBlockException extends Exception {
    @Override
    public String getMessage() {
        return "Invalid block! Please enter the 'go' command to retry!";
    }
}