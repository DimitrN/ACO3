package ua.artcode.week3.day1;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 24.11.14
 * Time: 19:30
 * To change this template use File | Settings | File Templates.
 */

// is-a
public class SomeInterfaceImplementation implements SomeInterface {
    @Override
    public void go() {
        System.out.println("Impl of method go");
    }

    @Override
    public void s() {
        System.out.println("Impl of method s");
    }
}
