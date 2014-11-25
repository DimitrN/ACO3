package ua.artcode.week3.day1;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 25.11.14
 * Time: 12:51
 * To change this template use File | Settings | File Templates.
 */
public class ExampleTester {
    private ISportsman sportsman;
    public void testRun(){
        if(sportsman.run() < 0){
            System.out.println("Test is failed");
        }
    }
}
interface ISportsman {
    int run();
    int jump();
}