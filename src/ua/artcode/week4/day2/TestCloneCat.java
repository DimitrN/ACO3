package ua.artcode.week4.day2;

import ua.artcode.DeepSerializeCopy;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 02.12.14
 * Time: 19:17
 * To change this template use File | Settings | File Templates.
 */
public class TestCloneCat {

    public static void main(String[] args) throws CloneNotSupportedException{

        System.out.println("Start");
        Cat cat = new Cat(4, "Kiev",23, new int[] {1,2,3});
        Cat catCloned = cat.clone();
        System.out.println("after clone()");


        String [] mas = {"let", "us", "go"};
        System.out.println(Arrays.toString(mas));

        String [] cloned = (String[]) DeepSerializeCopy.deepClone(mas);
        System.out.println(Arrays.toString(cloned));
}
}
