package ua.artcode.week3.day2.HomeTask;

import java.util.ArrayList;
import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 01.12.14
 * Time: 11:19
 * To change this template use File | Settings | File Templates.
 */
public class SequenceTest {
    public static void main(String[] args) {
        int [] m = { 6, 5, 3, 1,2,3,4,5,6, 10,11, 21};
        ArrayList mas = Sequence.mas(m);
        System.out.println(mas);
    }
}
