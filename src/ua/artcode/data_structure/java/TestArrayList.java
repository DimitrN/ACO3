package ua.artcode.data_structure.java;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 25.11.14
 * Time: 21:06
 * To change this template use File | Settings | File Templates.
 */
public class TestArrayList {
    public static void main(String[] args) {

        ArrayList al = new ArrayList();// size by default - 10

        al.add("A");
        al.add("C");
        al.add("D");
        al.add(0, "B");
        //all.clear();
        System.out.println(al.contains("A"));
        System.out.println(al.get(0));

        System.out.println(al.indexOf("a")); // -1
        System.out.println(al.isEmpty());//false
        al.set(2, "X");
        System.out.println(al.size());
        al.trimToSize(); // 4

        for(Object s : al){
            System.out.println(s);
        }

    }
}
