package ua.artcode.week3.day1.comp;

import java.util.Comparator;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 24.11.14
 * Time: 21:00
 * To change this template use File | Settings | File Templates.
 */
public class DogNameComparartor implements Comparator {
    @Override
    public int compare(Object o1, Object o2) {
        Dog dog1 = (Dog) o1;
        Dog dog2 = (Dog) o2;
        return dog1.getCallName().compareTo(dog2.getCallName());
    }
}
