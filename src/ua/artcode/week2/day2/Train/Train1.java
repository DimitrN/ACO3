package ua.artcode.week2.day2.Train;

import ua.artcode.week2.day2.Ticket.Ticket;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 23.11.14
 * Time: 21:02
 * To change this template use File | Settings | File Templates.
 */
public class Train1 extends Wagon {
    private int trainNumber;
    private String startPoint;
    private String endPoint;
    private String middlePoint;

    Wagon locomotive = new Wagon();
    Wagon general_01 = new Wagon();
    Wagon general_02 = new Wagon();
    Wagon general_03 = new Wagon();
    Wagon lux_04 = new Wagon();
    Wagon lux_05 = new Wagon();
    Wagon lux_06 = new Wagon();
    Wagon restaurant_07 = new Wagon();
    Wagon coupe_08 = new Wagon();
    Wagon coupe_09 = new Wagon();
    Wagon coupe_10 = new Wagon();
    Wagon general_11 = new Wagon();
    Wagon general_12 = new Wagon();
    Wagon general_13 = new Wagon();
    Wagon general_14 = new Wagon();

    private Wagon [] WagonToTrain = {locomotive,general_01,general_02,general_03, lux_04,lux_05,lux_06,restaurant_07,coupe_08,coupe_09,coupe_10,general_11,general_12,general_13,general_14};


    @Override
    public void boarding(Ticket someTicket, Train1 someTrain) {
        super.boarding(someTicket, someTrain);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void landing(Ticket someTicket, Wagon someWagon) {
        super.landing(someTicket, someWagon);    //To change body of overridden methods use File | Settings | File Templates.
    }

    @Override
    public void massLanding(Ticket[] wagonTickets, Train1 someTrain) {
        super.massLanding(wagonTickets, someTrain);    //To change body of overridden methods use File | Settings | File Templates.
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public void setStartPoint(String startPoint) {
        this.startPoint = startPoint;
    }

    public void setEndPoint(String endPoint) {
        this.endPoint = endPoint;
    }

    public void setMiddlePoint(String middlePoint) {
        this.middlePoint = middlePoint;
    }

    public void setWagonToTrain(Wagon[] wagonToTrain) {
        WagonToTrain = wagonToTrain;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public String getStartPoint() {
        return startPoint;
    }

    public String getEndPoint() {
        return endPoint;
    }

    public String getMiddlePoint() {
        return middlePoint;
    }

    public Wagon[] getWagonToTrain() {
        return WagonToTrain;
    }
}
