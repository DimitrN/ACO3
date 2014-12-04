package ua.artcode.data_structure.java;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 25.11.14
 * Time: 21:28
 * To change this template use File | Settings | File Templates.
 */
public interface iStack <T> extends Iterable <T> {

    /*
    * put element on top of stack
    * @param o element for stack
    * */

    void push(T o);


    /**
     * remove element from top
     * @return element from top
     */

    T pop();
}