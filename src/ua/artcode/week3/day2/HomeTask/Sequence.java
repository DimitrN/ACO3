package ua.artcode.week3.day2.HomeTask;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 01.12.14
 * Time: 10:19
 * To change this template use File | Settings | File Templates.
 */
public class Sequence {

    //написать метод, выводящий число макимальной длины последовательно увеличивающихся чисел,
    //т.е. из массива { 6, 5, 3, 1,2,3,4,5, 10, 21} должен показать 1,2,3,4,5


    static ArrayList mas (int [] mas2){
        ArrayList result =  new ArrayList();
        for (int i = 0; i < mas2.length-1; i++) {
            if (mas2 [i]+1 == mas2 [i+1]){
                result.add(mas2 [i]);
            }
        }
        Object o = result.get(result.size()-1);
        int o2 = (Integer) o;
        int o3 = (int) o2;
        int o4 = o3+1;
        result.add(o4);
        return result;
    }
}
