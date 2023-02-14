package exception;
/**
 * The DukeException class represents a custom exception thrown in the program.
 * It extends the Exception class and provides a constructor that accepts a string as input.
 */

public class DukeException extends Exception {
    /**
     * Constructs a DukeException with the specified detail message.
     *
     * @param str the detail message.
     */
    public DukeException(String str) {
        super(str);
    }
}
