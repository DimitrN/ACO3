package ua.artcode.week3.day2.HomeTask;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 01.12.14
 * Time: 9:52
 * To change this template use File | Settings | File Templates.
 */
public class SumString {
    static String sumString (String a, String b){
        int A = Integer.valueOf(a);
        int B = Integer.valueOf(b);
        int AB = A+B;
        String result = String.valueOf(AB);
        return result;
    }
}
