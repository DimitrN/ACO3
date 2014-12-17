package ua.artcode.data_structure.java.exception;

/**
 * се которые extends от RuntimeException являются unchecked
 */
public class StackEmptyException extends RuntimeException {

    public StackEmptyException (String message) {
        super(message);
    }
}
