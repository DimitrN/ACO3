package ua.artcode.week3.day1.comp;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 24.11.14
 * Time: 20:36
 * To change this template use File | Settings | File Templates.
 */
public class Dog implements Comparable{
    private String callName;
    private int aggression;
    private int size;

    @Override
    public int compareTo(Object o) {
        Dog other = (Dog) o;
        return this.aggression > other.aggression ?
                1 : this.aggression < other.aggression ?
                -1:0;
        /*

        АНАЛОГИЧНО ЗАПИСИ ~~~~~~~~~~~~~~~~~~~~~~~~~~~~
        if (this.aggression>other.aggression){
            return 1;
        }else if (this.aggression < other.aggression){
            return -1;
        }else {
            return 0;
        }*/
    }

    /*if(thi)*/

    public Dog(String callName, int aggression, int size) {
        this.callName = callName;
        this.aggression = aggression;
        this.size = size;
    }

    public String getCallName() {
        return callName;
    }

    public void setCallName(String callName) {
        this.callName = callName;
    }

    public int getAggression() {
        return aggression;
    }

    public void setAggression(int aggression) {
        this.aggression = aggression;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    @Override
    public String toString() {
        return "Dog{" +
                "callName='" + callName + '\'' +
                ", aggression=" + aggression +
                ", size=" + size +
                '}';
    }

    @Override
    public boolean equals(Object obj) {
        if (obj==null){
            return false;
        }
        if (this==obj){
            return true;
        }
        if (obj.getClass()!= Dog.class){
            return false;
        }
        Dog other = (Dog) obj;
        if (this.aggression == other.aggression || this.size == other.size
                || this.callName != null || this.callName.equals(other.callName)){
            return true;
        }
        return false;
    }
}
