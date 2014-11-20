package ua.artcode.week2.day2.game;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 18.11.14
 * Time: 20:27
 * To change this template use File | Settings | File Templates.
 */
public class GameCharacter {

    private String name;
    private int health;
    private Weapon weapon;


    public GameCharacter(String name, int health, Weapon weapon) {
        this.name = name;
        this.health = health;
        this.weapon = weapon;
    }

    @Override
    public String toString() {
        return "GameCharacter{" +
                "name='" + name + '\'' +
                ", health=" + health +
                '}';
    }

    public void fight (GameCharacter enemy){
        enemy.takeDamage(weapon.use());

    }

    public void takeDamage(int damage){
        health -=damage;

    }


    public String getName() {
        return name;
    }

    public int getHealth() {
        return health;
    }

    public Weapon getWeapon() {
        return weapon;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setWeapon(Weapon weapon) {
        this.weapon = weapon;
    }
}
