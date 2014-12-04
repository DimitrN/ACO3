package ua.artcode.week4.day2;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 02.12.14
 * Time: 20:25
 * To change this template use File | Settings | File Templates.
 */
public class TestGeneric {
    public static void main(String[] args) {
        GenericContainer container = new GenericContainer();



        GenericContainer <String, Integer> container1 =
                new GenericContainer<>();
        Integer i = container1.getTwo();
        Integer s = container1.getOne();
    }
}
