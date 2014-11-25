package ua.artcode.week3.day1.comp;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 24.11.14
 * Time: 20:39
 * To change this template use File | Settings | File Templates.
 */
public class SortDogs {
    public static void main(String[] args) {

        Dog [] dogs = new Dog[5];
        dogs [0] = new Dog("Barsik", 30,7);
        dogs [1] = new Dog("Bobik", 70,8);
        dogs [2] = new Dog("Muha", 40,4);
        dogs [3] = new Dog("Yoj", 4,10);
        dogs [4] = new Dog("Valera", 100,12);

        Arrays.sort(dogs);
        System.out.println(Arrays.toString(dogs));

        Arrays.sort(dogs);
        System.out.println(Arrays.toString(dogs));


    }
}
