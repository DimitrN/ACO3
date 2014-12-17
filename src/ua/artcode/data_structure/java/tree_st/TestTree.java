package ua.artcode.data_structure.java.tree_st;

/**
 * User: КЕП Date: 16.12.14 Time: 20:16
 */
public class TestTree {
    public static void main(String[] args) {
        iTree <Integer> tree = new BinarySearchTree<Integer>(50,25,10,20,35,40,75,60,80,90);
        tree.traversPrint();
        System.out.println("\nend");

        System.out.println(tree.minNodeValue());
        System.out.println(tree.maxNodeValue());


    }
}
