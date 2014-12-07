package ua.artcode.week5.day2;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 07.12.14
 * Time: 21:10
 * To change this template use File | Settings | File Templates.
 */
public class TestUncheckedException {
    public static void main(String[] args) {
        a();
        System.out.println("after a()");
    }
    public static void a(){
        b();
    }
    public static void b(){
        int[] mas = new int[2];
        int res = mas[6];
        c();
    }
    public static void c(){
        String s = null;
        s.toString();
        System.out.println("after c");
    }
}
