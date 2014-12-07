package ua.artcode.data_structure.java;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 25.11.14
 * Time: 21:43
 * To change this template use File | Settings | File Templates.
 */
public class TestStack {
    public static void main(String[] args) {
        iStack as = new LinkedStack();
        as.push("A");
        as.push("B");
        as.push("C");
        as.push("D");
        as.push("E");

        System.out.println(as);

        System.out.println(as.pop());
        System.out.println(as.pop());
        System.out.println(as.pop());
        System.out.println(as.pop());
        System.out.println(as.pop());
        System.out.println(as.pop());
    }

    public static void doStack (iStack as){

    }

}
