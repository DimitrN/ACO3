package ua.artcode.week3.day2;

import ua.artcode.algo.InsertionSort;
import ua.artcode.week3.day2.TimeCheck.TimeAction;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 25.11.14
 * Time: 19:31
 * To change this template use File | Settings | File Templates.
 */
public class InsertionSorter implements TimeAction {
    private int[] mas;
    public InsertionSorter(int[] mas) {
        this.mas = mas;
    }
    @Override
    public void action() {
        InsertionSort.sort(mas);
    }
}
