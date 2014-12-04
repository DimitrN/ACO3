package ua.artcode.week4.day2;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 02.12.14
 * Time: 19:13
 * To change this template use File | Settings | File Templates.
 */
public class Cat implements Cloneable, Comparable <Cat> {

    private int age;
    private String Home;
    private double weight;
    private int[] mas;


    public Cat() {
    }

    public Cat(int age, String name, double weight, int[] mas) {
        this.age = age;
        this.Home = name;
        this.weight = weight;
        this.mas = mas;
    }





















    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getHome() {
        return Home;
    }

    public void setHome(String home) {
        this.Home = home;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int[] getMas() {
        return mas;
    }

    public void setMas(int[] mas) {
        this.mas = mas;
    }


    @Override
    public String toString() {
        return "Cat{" +
                "age=" + age +
                ", Home='" + Home + '\'' +
                ", weight=" + weight +
                ", mas=" + mas +
                '}';
    }


    @Override
    public Cat clone() /*throws CloneNotSupportedException*/{
    Cat cloned = (Cat) super.clone();
        cloned.setHome(new String(Home));
        cloned.setMas(Arrays.copyOf(mas,mas.length));
        return cloned;

    }




}
