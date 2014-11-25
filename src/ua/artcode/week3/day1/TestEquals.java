package ua.artcode.week3.day1;

import ua.artcode.week3.day1.comp.Dog;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 24.11.14
 * Time: 21:33
 * To change this template use File | Settings | File Templates.
 */
public class TestEquals {
    public static void main(String[] args) {
        Dog dog1 = new Dog("Barsic",20,10);
        Dog dog2 = new Dog("Barsic",20,10);


        System.out.println("dog1 == dog2 "+(dog1==dog2));
        System.out.println("dog.equals(dog2)"+ dog1.equals(dog2));
    }
}
