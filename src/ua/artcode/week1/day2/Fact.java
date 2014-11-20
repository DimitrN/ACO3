package ua.artcode.week1.day2;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 15.11.14
 * Time: 22:55
 * To change this template use File | Settings | File Templates.
 */
public class Fact {
    public static int fact (int i){
        if (i==0)return 1;
        return fact(i-1)*i;
    }
}
