package ua.artcode.data_structure.java.exception;

/**
 * се которые extends от RuntimeException являются unchecked
 */
public class StackEmptyExeption extends RuntimeException {





    public StackEmptyExeption (String message) {
        super(message);
    }
}
