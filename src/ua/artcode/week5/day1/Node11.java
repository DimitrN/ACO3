package ua.artcode.week5.day1;

import ua.artcode.dynamic_ds.Node;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 06.12.14
 * Time: 11:30
 * To change this template use File | Settings | File Templates.
 */
public class Node11 {

    public static Node reverse (Node curr){

    Node first = null;
    Node next = null;


        while (curr != null){
            next = curr.getNext();
            curr.setNext(first);
            first = curr;
            curr = next;
        }
        return first;
    }


}
