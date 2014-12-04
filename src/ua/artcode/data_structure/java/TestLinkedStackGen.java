package ua.artcode.data_structure.java;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 04.12.14
 * Time: 17:16
 * To change this template use File | Settings | File Templates.
 */
public class TestLinkedStackGen {

    public static void main(String[] args) {
        iStack<String> stack = new LinkedStackGen<String>();
        stack.push("1");
        stack.push("2");
        stack.push("3");
        stack.push("3");
        for(String s : stack){
        }
    }
}
