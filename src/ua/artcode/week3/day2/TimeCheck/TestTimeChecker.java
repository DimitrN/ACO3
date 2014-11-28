package ua.artcode.week3.day2.TimeCheck;

import ua.artcode.Merger;
import ua.artcode.week3.day2.InsertionSorter;
import ua.artcode.algo.ArraysUtils;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 25.11.14
 * Time: 19:36
 * To change this template use File | Settings | File Templates.
 */
public class TestTimeChecker {
    public static void main(String[] args) {
        int size = 1000000;
        int[] mas1 = ArraysUtils.genMas(size);
        int[] mas2 = ArraysUtils.genMas(size);
// algorithm quick sort
        Arrays.sort(mas1);
        Arrays.sort(mas2);
        TimeChecker.check(new Merger(mas1,mas2));
        int[] dest = new int[mas1.length + mas2.length];
        System.arraycopy(mas1, 0, dest, 0, mas1.length);
        System.arraycopy(mas2, 0, dest, mas1.length, mas2.length);
        TimeChecker.check(new InsertionSorter(dest));
    }
}
