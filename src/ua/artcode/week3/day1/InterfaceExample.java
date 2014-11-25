package ua.artcode.week3.day1;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 25.11.14
 * Time: 12:54
 * To change this template use File | Settings | File Templates.
 */
public class InterfaceExample {

    /*Методы класса Company могут принимать на вход объекты типа только Student или только Worker
      * Создаем два интерфейса WorkerBehavior и StudentBehavior со своими методами в каждом
       * Потом можем имплементировать (внедрить) эти интерфейсы в классы Student или Worker.
       * После чего методы класса Company могут принимать на вход объекты как типа Student так и типа Worker*/


    interface WorkerBehavior {
        void work();
    }

    interface StudentBehavior {
        void study();
    }

    class Worker implements WorkerBehavior {
        @Override
        public void work() {
            System.out.println("worker");
        }
    }

    class Student implements WorkerBehavior, StudentBehavior{
        @Override
        public void study() {
            System.out.println("Student study");
        }

        @Override
        public void work() {
            System.out.println("Student work");
        }

        class Company {
            void testWorker (WorkerBehavior w){

            }
        }
    }
}
