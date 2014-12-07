package ua.artcode.dynamic_ds;

import javafx.beans.binding.When;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 01.12.14
 * Time: 19:33
 * To change this template use File | Settings | File Templates.
 */
public class NodeUtils {

    public static void print(Node chain){
        while (chain != null){ // exit condition
            System.out.println(chain.getValue()); // action
            chain = chain.getNext(); // step
        }
    }
    public static Object[] toArray(Node chain){
        return null;
    }
    public static Node genChain(int[] mas){
        if(mas.length == 0){
            return null;
        } else {
            Node next = genChain(Arrays.copyOfRange(mas,1, mas.length));
            Node current = new Node(mas[0], next);
            return current;
        }
    }
    public static String toString(Node curr){
        return curr != null ? "[" + curr.getValue() + "]-->" +
                toString(curr.getNext()) : "null";
    }

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
