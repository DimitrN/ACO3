package ua.artcode.week5.day2;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 07.12.14
 * Time: 11:58
 * To change this template use File | Settings | File Templates.
 */
public class TestParseException {

    public static final String PATTERN = "yyyy/MM/dd";

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.printf("Input date as %s\n", PATTERN);
        String input = sc.nextLine();
        Date date = null;

        try {
            date = parse(input);
            System.out.println("after parse");
        } catch (ParseException e){
            System.out.println("In catch block");
            e.printStackTrace();
        }

        System.out.printf("After try date %1$1ty - %1$1tM - %1$1td ", date);

    }
    public static Date parse (String seg) throws ParseException {
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy/MM/dd");
        Date res = sdf.parse(seg);
        return res;
    }
}
