package ua.artcode.data_structure.java;

import ua.artcode.dynamic_ds.Node;

import java.util.Iterator;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 01.12.14
 * Time: 19:49
 * To change this template use File | Settings | File Templates.
 */
public class LinkedStackGen implements iStack {

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


    private class StackNode{
        private Object value;
        private StackNode next;

        private StackNode(Object value, StackNode next) {
            this.value = value;
            this.next = next;
        }

        public void go(){
            top.getNext();
            pop();
        }





    }


    private class LinkedStackIterator implements Iterator<T>, Iterable <I> {

        StackNode iter = top;


        @Override
        public boolean hasNext() {
            return iter != null;  //To change body of implemented methods use File | Settings | File Templates.
        }

        @Override
        public T next() {
        T ret = iter.value;
        iter =
        }

        @Override
        public void remove() {
            //To change body of implemented methods use File | Settings | File Templates.
        }
    }






}
