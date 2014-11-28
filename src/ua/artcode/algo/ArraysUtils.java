package ua.artcode.algo;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 25.11.14
 * Time: 19:10
 * To change this template use File | Settings | File Templates.
 */
public class ArraysUtils {
    public static int[] genMas(int size){
        int[] mas = new int[size];
        for (int i = 0; i < mas.length; i++) {
            mas[i] = (int)(Math.random() * 1000);
        }
        return mas;
    }
}
