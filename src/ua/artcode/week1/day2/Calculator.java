package ua.artcode.week1.day2;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 16.11.14
 * Time: 19:43
 * To change this template use File | Settings | File Templates.
 */
public class Calculator {
    public static void main(String[] args) {

        double result;
        Scanner sc = new Scanner(System.in);
        double firstdigit = sc.nextDouble();
        String param = sc.nextLine();
        String param2 = sc.nextLine();
        double seconddigit = sc.nextDouble();

        if (param2.equals("+")){
            result = firstdigit+seconddigit;
            System.out.println(result);
        }
        if (param2.equals("-")){
            result = firstdigit-seconddigit;
            System.out.println(result);
        }
        if (param2.equals("*")){
            result = firstdigit*seconddigit;
            System.out.println(result);
        }
        if (param2.equals("/")){
            result = firstdigit/seconddigit;
            System.out.println(result);
        }


    }
}
