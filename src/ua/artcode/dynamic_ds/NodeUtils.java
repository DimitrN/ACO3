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
    public static getLast (Node node){

    }

    public static Node getByIndex (Node chain, int index){

        Node iter = chain;
        int i = 0;
        while (iter!=null){
            if (index==0){
                return iter;
            } else {
                index--;
                iter = iter.getNext();
            }
        }
        return  null;
    }

    public static void print (Node chain){
        while (chain!=0){
            System.out.println(chain.getValue());
            chain = chain.getNext();//Step

        }
    }

    private static String toString (Node curr){
        return curr != null ? curr.getValue()+toString(curr.getNext()) : "";
    }

    public static Node genChainMy (int [] mas){
        Node someNode = new Node();
        if (someNode.getNext()==null) return Node(mas[0],null);
        return genChainMy(Arrays.copyOfRange(mas,1,mas.length));
    }

    public static Node


}
