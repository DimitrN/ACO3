package ua.artcode.week3.day2.HomeTask;

import ua.artcode.home.AbstractArrayList;

import java.util.List;

/**
 * Created with IntelliJ IDEA.
 * User: user
 * Date: 01.12.14
 * Time: 13:00
 * To change this template use File | Settings | File Templates.
 */
public class MyArrayList extends AbstractArrayList {
    int i=0;// дефолтовый размер массива
    Object [] starterMas = new Object[i];

    @Override
    public int size() {
        return starterMas.length;
    }

    @Override
    public boolean isEmpty() {
        if (starterMas.length==0){
        return true;
        }
        return false;
    }

    @Override
    public boolean contains(Object o) {
        if (indexOf(o)>=0){
        return true;
        }
        return false;
    }

    @Override
    public Object[] toArray() {
        return new Object[0];  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean add(Object o) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public boolean remove(Object o) {
        return false;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void clear() {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object get(int index) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object set(int index, Object element) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public void add(int index, Object element) {
        //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public Object remove(int index) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int indexOf(Object o) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public int lastIndexOf(Object o) {
        return 0;  //To change body of implemented methods use File | Settings | File Templates.
    }

    @Override
    public List subList(int fromIndex, int toIndex) {
        return null;  //To change body of implemented methods use File | Settings | File Templates.
    }
}
