package ua.artcode.week5.day1;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 06.12.14
 * Time: 13:29
 * To change this template use File | Settings | File Templates.
 */
public class EagerSingleton {
    private static EagerSingleton INSTANCE = new EagerSingleton();

    private EagerSingleton() {}
    public static EagerSingleton getINSTANCE(){
        return INSTANCE;
    }
}
