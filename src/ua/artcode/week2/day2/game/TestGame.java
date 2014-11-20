package ua.artcode.week2.day2.game;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 18.11.14
 * Time: 20:36
 * To change this template use File | Settings | File Templates.
 */
public class TestGame {
    public static void main(String[] args) {

        Sword sword = new Sword();
        Knife knife = new Knife();


        GameCharacter human = new GameCharacter("Vasya", 100, sword);
        GameCharacter troll = new GameCharacter("Troll", 150, knife);


        Fight f = new Fight();

        f.startFight(human,troll);

    }
}
