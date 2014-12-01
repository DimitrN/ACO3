package ua.artcode.data_structure.java;

import ua.artcode.dynamic_ds.Node;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 01.12.14
 * Time: 19:49
 * To change this template use File | Settings | File Templates.
 */
public class LinkedStack implements iStack {

    private Node top;

    @Override
    public void push(Object o) {
        if (top == null){
            top = new Node(o, null);
        } else {
            Node newNode = new Node(o,top);
            top = newNode;
        }
        //refactored top = new Node(o, top);
    }

    @Override
    public Object pop() {
        if (top == null){
            return null;
        } else {
        Object ret = top.getValue();
        top = top.getNext();
        return ret;
        }
    }
}
