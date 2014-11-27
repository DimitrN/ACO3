package ua.artcode.week3;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 25.11.14
 * Time: 19:30
 * To change this template use File | Settings | File Templates.
 */
public class TimeChecker {
    public static void ckeck (TimeAction actionObj){
        long start = System.currentTimeMillis();
        actionObj.action();
        System.out.println("Action time of "+actionObj.getClass().getSimpleName()+
                " is " + (System.currentTimeMillis()-start));

    }
}
