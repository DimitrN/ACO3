package ua.artcode.week4.day2;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 02.12.14
 * Time: 20:19
 * To change this template use File | Settings | File Templates.
 */
public class GenericContainer <T, V> {

    private T one;
    private V two;

    public GenericContainer() {
    }
    public GenericContainer(T one, V two) {
        this.one = one;
        this.two = two;
    }
    public void test(){
    }
    public T getOne() {
        return one;
    }
    public void setOne(T one) {
        this.one = one;
    }
    public V getTwo() {
        return two;
    }
    public void setTwo(V two) {
        this.two = two;
    }
    public static void show(){
    }
}
