package ua.artcode.week2.day2.Ticket;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 21.11.14
 * Time: 15:03
 * To change this template use File | Settings | File Templates.
 */
public class Wagon {


    /*
    1 - Couchette car
    2 - Coupe
    3 - Sleeping car
    */

    private byte wagonNumber;
    private byte seatNumber;
    private byte wagonType;
    private double price;



    //SETTERS
    public void setWagonNumber(byte wagonNumber) {
        this.wagonNumber = wagonNumber;
    }

    public void setSeatNumber(byte seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setWagonType(byte wagonType) {
        this.wagonType = wagonType;
    }

    public void setPrice(double price) {
        if (getWagonType()==1)
        this.price = price;
    }

    //GETTERS
    public byte getWagonNumber() {
        return wagonNumber;
    }

    public byte getSeatNumber() {
        return seatNumber;
    }

    public byte getWagonType() {
        return wagonType;
    }

    public double isPrice() {
        return price;
    }
}
