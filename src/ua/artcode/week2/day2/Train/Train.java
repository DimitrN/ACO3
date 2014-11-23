package ua.artcode.week2.day2.Train;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 23.11.14
 * Time: 21:02
 * To change this template use File | Settings | File Templates.
 */
public class Train {
    private int trainNumber;
    private String startPoint;
    private String endPoint;
    private String middlePoint;


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
}
