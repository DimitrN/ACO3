package ua.artcode.week2.day2.Ticket;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 21.11.14
 * Time: 14:03
 * To change this template use File | Settings | File Templates.
 */
public class Schedule {
    Date data = new Date();
    SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd_HH:mm");

    private String departurePoint;// = {"Kiev","Lviv","Odessa","Donetsk","Vinnitsa","Riga" };
    private String destinationPoint;// = {"Kiev","Lviv","Odessa","Donetsk","Vinnitsa","Riga" };
    private int trainNumber;


    public Schedule(String departurePoint, String destinationPoint, int trainNumber) {
        this.departurePoint = departurePoint;
        this.destinationPoint = destinationPoint;
        this.trainNumber = trainNumber;
    }

    Schedule ruot1 = new Schedule("Kiev","Lviv",2089);
    Schedule ruot2 = new Schedule("Lviv","Kiev",189);
    Schedule ruot3 = new Schedule("Vinnitsa","Lviv",15);
    Schedule ruot4 = new Schedule("Kiev","Donetsk",3000);
    Schedule ruot5 = new Schedule("Kiev","Poltava",987);
    Schedule ruot6 = new Schedule("Odessa","Kiev",251);
    Schedule ruot7 = new Schedule("Lugansk","Lviv",78);




    //SETTERS


    //GETTERS


}
