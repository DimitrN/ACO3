package ua.artcode.week5.day1.Project_tracker;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 06.12.14
 * Time: 12:28
 * To change this template use File | Settings | File Templates.
 */
public interface ValidationInterface <User> {

    public boolean loginValidation (User someLogin);

    public boolean emailValidation (User someEmail);

    public boolean passwordValidation (User somePassword);
}
