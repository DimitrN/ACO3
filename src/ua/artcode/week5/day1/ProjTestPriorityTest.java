package ua.artcode.week5.day1;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 06.12.14
 * Time: 13:47
 * To change this template use File | Settings | File Templates.
 */
public class ProjTestPriorityTest {
    public static void main(String[] args) {
        ProjectTrackingPriority maj = ProjectTrackingPriority.MAJOR;



        System.out.println("order" + maj.ordinal() + "name" + maj.name());

        ProjectTrackingPriority min = ProjectTrackingPriority.valueOf("MINOR");
        ProjectTrackingPriority [] priorities = ProjectTrackingPriority.values();
    }
}
