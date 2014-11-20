package ua.artcode.week2.stat;






public class Man {
    private static int count;
    // run during loading class
    static {
        count = 0;
    }
    // general block for all constructors
    {
        count++;
    }
    private int number;
    public Man() {
    }
    public Man(int number) {
        this.number = number;
    }
    public int getNumber() {
        return number;
    }
    public void setNumber(int number) {
        this.number = number;
    }
    public void nonStaticMeth(){
        count++;
    }
    public static void statMeth(){
    }
}