package ua.artcode.week2;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 20.11.14
 * Time: 16:32
 * To change this template use File | Settings | File Templates.
 */
public class CalendarTest {
    public static void main(String[] args) {
        Date date = new Date();
        String dform = "2014/11/29 10:50";
        SimpleDateFormat sdate = new SimpleDateFormat("2014/11/29 10:50");
        System.out.println(sdate.format(date));
        System.out.println();


        Calendar calendar = new GregorianCalendar(2000,10,12,22,22);
        System.out.printf("Date %tc", calendar.getTime());
        Calendar calendar1 = Calendar.getInstance();

    }
}
