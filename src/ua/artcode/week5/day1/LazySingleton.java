package ua.artcode.week5.day1;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 06.12.14
 * Time: 13:34
 * To change this template use File | Settings | File Templates.
 */
public class LazySingleton {

    private static LazySingleton INSTANCE = null;

    private LazySingleton () {}

    public static LazySingleton getINSTANCE () {
        if (INSTANCE == null){
            INSTANCE = new LazySingleton();
        }
        return INSTANCE;
    }

}
