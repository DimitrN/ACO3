package ua.artcode.week2.day2.Ticket;

import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 21.11.14
 * Time: 11:36
 * To change this template use File | Settings | File Templates.
 */
public class TicketDesk {

    TicketLux [] Lux = new TicketLux[18];
    TicketCoupe [] Coupe = new TicketCoupe[36];
    TicketGeneral [] general = new TicketGeneral[54];



    public void allTicketsInfo (){
        System.out.println("Lux - " + Lux.length);
        System.out.println("Coupe - " + Coupe.length);
        System.out.println("General - " + general.length);
    }

    public void ticketInfo (Ticket someTicket) {
        System.out.println(someTicket.getTrainNumber());
        System.out.println(someTicket.getSeatNumber());
        System.out.println(someTicket.getWagonNumber());
    }








    /*private String [] departurePoint = {"Kiev","Lviv","Odessa","Donetsk","Vinnitsa","Riga" };
    private String [] destinationPoint = {"Kiev","Lviv","Odessa","Donetsk","Vinnitsa","Riga" };
    private String departureDate;
    private int trainNumber;
    private byte wagonNumber;
    private byte seatNumber;
    private double ticketPrice;*/



    // SETTERS


    // GETTERS

}
