package ua.artcode.week3.day2;

import ua.artcode.algo.InsertionSort;
import ua.artcode.week3.day2.TimeCheck.TimeAction;


public class InsertionSorter implements TimeAction{
    private int[] mas;
    public InsertionSorter(int[] mas) {
        this.mas = mas;
    }

    @Override
    public void action() {
        InsertionSort.sort(mas);
    }
}
