package ua.artcode.week2.day2.Train;

import ua.artcode.week2.day2.Ticket.Ticket;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 23.11.14
 * Time: 21:33
 * To change this template use File | Settings | File Templates.
 */
public class Wagon {
    private int place;
    private Ticket [] wagonTickets = new Ticket[place];


    public void boarding (Ticket someTicket, Train someTrain){
        if (this.place >0 || someTicket.getTrainNumber()==someTrain.getTrainNumber()){
            System.out.println("Passenger successfully boarded");
            this.place --;
        }
    }

    public void landing (Ticket someTicket, Wagon someWagon){
        if (someTicket.getSeatNumber()==someWagon.place)
            System.out.println("Passenger with seat Place" + place + " go out!");
        someWagon.place++;
    }

    public void massLanding (Ticket someTicker, Train someTrain){
        for (int i = 0; i < place; i++) {
        if (wagonTickets [i].getDestinationPoint()==someTrain.getEndPoint()
                || wagonTickets [i].getDestinationPoint()==someTrain.getMiddlePoint())
            System.out.println("It is your station, go out!");
            this.place++;
        }
    }

    public void goOut (Train someTrain){

    }


}
