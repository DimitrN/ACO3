package ua.artcode.week2.day2.game;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 18.11.14
 * Time: 21:02
 * To change this template use File | Settings | File Templates.
 */
public class Fight {

    public void startFight (GameCharacter somePlayer1, GameCharacter somePlayer2){
        int count = 0;
        int count2 = 0;
        for (int i = 0; somePlayer1.getHealth()> 0 || somePlayer2.getHealth()>0; i++) {
            if (i%2==0){
                somePlayer1.fight(somePlayer1);
                count++;
                somePlayer1.getHealth();
                if (somePlayer1.getHealth()<0) break;
            } else {
                somePlayer2.fight(somePlayer2);
                count2++;
                somePlayer2.getHealth();
                if (somePlayer2.getHealth()<0) break;
            }
        }
        System.out.println("Удары" + count + "ХП" + somePlayer1.getHealth());
        System.out.println("Удары" + count2 + "ХП" + somePlayer2.getHealth());
    }

}
