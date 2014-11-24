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

    // переменная place - конкретное место в вагоне
    private int place;
    /*массив мест в вагоне, массив не обязательно должен быть заполнен весь (кто то еще не сел в поезд, ячейка = 0)*/
    private int [] wagonPlaces;
    /*массив всех билетов, которые есть у проводника, билеты людей которые сели в поезд*/
    private Ticket [] wagonTickets;



    // метод посадки одного пассажира, на вход требует поезд и билет
    public void boarding (Ticket someTicket, Train1 someTrain){
        /*если в массиве мест вагона конкретное место ==0 и номер поезда,
        в котором состоит вагон, совпадает с номером поезда на билете - то сажаем пассажира*/
        if (wagonPlaces [someTicket.getSeatNumber()] == 0 || someTicket.getTrainNumber()==someTrain.getTrainNumber()){
            System.out.println("Passenger successfully boarded");
            wagonPlaces [someTicket.getSeatNumber()] = someTicket.getSeatNumber();

        }
    }


    //высадка пассажира по номеру места, на вход требует билет и вагон
    public void landing (Ticket someTicket, Wagon someWagon){
        if (wagonPlaces [someTicket.getSeatNumber()] != 0){
            System.out.println("Passenger with seat Place" + place + " go out!");
            wagonPlaces [someTicket.getSeatNumber()] = 0;
        }
    }
    //массовая высадка пассажиров по прибытию в пункт назначения
    public void massLanding (Ticket [] wagonTickets, Train1 someTrain){
        for (int i = 0; i < wagonPlaces.length; i++) {
        if (wagonTickets [i].getDestinationPoint()==someTrain.getEndPoint()
                || wagonTickets [i].getDestinationPoint()==someTrain.getMiddlePoint())
            System.out.println("It is your station, go out!");
            wagonTickets [i] = null;
        }
    }

    /*public void goOut (Train1 someTrain){
    }*/
}
