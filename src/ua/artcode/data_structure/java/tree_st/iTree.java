package ua.artcode.data_structure.java.tree_st;

/**
 * User: КЕП Date: 16.12.14 Time: 19:53
 */
public interface iTree<E> {


    void add (E el);
    boolean contains (E el);

    E minNodeValue ();
    E maxNodeValue ();

    void traversPrint ();

}
