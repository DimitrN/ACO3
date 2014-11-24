package ua.artcode.week2.day2.Ticket;

import java.util.Date;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 21.11.14
 * Time: 12:15
 * To change this template use File | Settings | File Templates.
 */
public class Ticket {

    private String departurePoint;// = {"Kiev","Lviv","Odessa","Donetsk","Vinnitsa","Riga" };
    private String destinationPoint;// = {"Kiev","Lviv","Odessa","Donetsk","Vinnitsa","Riga" };
    private String departureDate;
    private int trainNumber;
    private byte wagonNumber;
    private byte seatNumber;
    private double ticketPrice;

    private byte wagonType;

    public Ticket() {
    }

    public Ticket(String departurePoint, String destinationPoint, String departureDate, int trainNumber, byte wagonNumber, byte seatNumber, double ticketPrice) {
        this.departurePoint = departurePoint;
        this.destinationPoint = destinationPoint;
        this.departureDate = departureDate;
        this.trainNumber = trainNumber;
        this.wagonNumber = wagonNumber;
        this.seatNumber = seatNumber;
        this.ticketPrice = ticketPrice;
    }


    //GETTERS
    public String getDeparturePoint() {
        return departurePoint;
    }

    public String getDestinationPoint() {
        return destinationPoint;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public byte getWagonNumber() {
        return wagonNumber;
    }

    public byte getSeatNumber() {
        return seatNumber;
    }

    public double getTicketPrice() {
        return ticketPrice;
    }

    //SETTERS

    public void setDeparturePoint(String departurePoint) {
        this.departurePoint = departurePoint;
    }

    public void setDestinationPoint(String destinationPoint) {
        this.destinationPoint = destinationPoint;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setWagonNumber(byte wagonNumber) {
        this.wagonNumber = wagonNumber;
    }

    public void setSeatNumber(byte seatNumber) {
        this.seatNumber = seatNumber;
    }

    public void setTicketPrice(double ticketPrice) {
        this.ticketPrice = ticketPrice;
        }



    /*Scanner sc = new Scanner(System.in);
        System.out.println("Enter Point of departure");
        String depP = sc.nextLine();

        System.out.println("Enter Point of destination");
        String destP = sc.nextLine();

        System.out.println("Enter departure date in format 'yyyy/MM/dd HH:mm' ");
        String depD = sc.nextLine();

        System.out.println("Enter train number");
        int trNumber = sc.nextInt();

        System.out.println("Enter wagon number");
        byte wagonNumber = sc.nextByte();

        System.out.println("Enter seat number");
        byte seatNumber = sc.nextByte();

        System.out.println("Enter Wagon");
        double ticketPrice = sc.nextDouble();




        TicketDesk t1 = new TicketDesk(depP, destP, depD, trNumber, wagonNumber, seatNumber, ticketPrice);


    }*/
}
