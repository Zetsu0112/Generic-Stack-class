/**
 * Class provides constructors and methods to create and modify a stack of any type of variable.
 * @author Philip Djurak
 * @version 13-04-2025
 */

public class StackFullException extends RuntimeException {

    /**
     * Creates a new StackFullException with an error message
     * 
     * @param message serves as the error message
     */
    public StackFullException (String message) {
        super(message);
    }
}
