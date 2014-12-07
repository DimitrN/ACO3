package ua.artcode.week5.day1.Project_tracker;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 06.12.14
 * Time: 12:25
 * To change this template use File | Settings | File Templates.
 */
public class Validation implements ValidationInterface {


    @Override
    public boolean loginValidation(Object someLogin) {
        String someLoginString = (String) someLogin;
        char someLoginChar = (char) someLogin;
        char [] mas = someLoginString.toCharArray();

        for (int i = 0; i <someLoginString.length() ; i++) {
            if(Character.isDigit(mas[i])){
                return false;
                //break;
            }
        }
        return someLoginString.length()>8;
    }

    @Override
    public boolean emailValidation(Object someEmail) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean passwordValidation(Object somePassword) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
