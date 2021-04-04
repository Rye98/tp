package seedu.duke.exception;

public class InvalidBlockException extends NusMazeException {
    @Override
    public String getMessage() {
        return "Invalid block! Please check your start and destination block again :(";
    }
}
