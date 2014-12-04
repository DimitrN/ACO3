package ua.artcode.dynamic_ds;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 01.12.14
 * Time: 19:32
 * To change this template use File | Settings | File Templates.
 */
public class Node {

    private Object value;
    private Node next;
    public Node() {
    }
    public Node(Object value) {
        this.value = value;
    }
    public Node(Object value, Node next) {
        this.value = value;
        this.next = next;
    }
    public Object getValue() {
        return value;
    }
    public void setValue(Object value) {
        this.value = value;
    }
    public Node getNext() {
        return next;
    }
    public void setNext(Node next) {
        this.next = next;
    }
}
