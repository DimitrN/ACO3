package ua.artcode.week2.day2.game;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 18.11.14
 * Time: 20:24
 * To change this template use File | Settings | File Templates.
 */
public abstract class Weapon {

    int duration = 100;

    protected Weapon() {
    }

    public abstract int use();

    private void minusDuration (){
        duration -= 10;
    }
}
