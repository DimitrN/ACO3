package ua.artcode.dynamic_ds;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 01.12.14
 * Time: 19:34
 * To change this template use File | Settings | File Templates.
 */
public class NodeTest {
    public static void main(String[] args) {
        int [] mas = {1,2,3,4,5};

        Node first = new Node(1, null);
        Node second = new Node (2, first);
        Node third = new Node(3, second);
        Node fourth = new Node(4, third);
        Node five = new Node(5,fourth);

        Node top = new Node(0,null);
        for (int i = 1; i < 6; i++) {
            top = new Node(i,top);

        }
        Node chain = NodeUtils.genChainMy(mas);

    }


}
