package ua.artcode.data_structure.java;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 25.11.14
 * Time: 21:30
 * To change this template use File | Settings | File Templates.
 */
public class ArrayStack implements iStack {

    private Object[] mas;
    private int top = 0;
    public ArrayStack(){
        mas = new Object[10];
    }

    @Override
    public void push(Object o) {
        if (top < mas.length){
    mas [top++] = o;// вначале = потом ++
        } else {
            System.out.println("Stack is full");
        }
    }

    @Override
    public Object pop() {
        if (top < mas.length){
            return null;
        }
        return mas [--top];//вначале -- потом вернет значение в массив
    }




    @Override
    public String toString() {
        StringBuilder res = new StringBuilder();
        for (int i = top-1; i >= 0; i--) {
            res.append(mas[i]).append("|\n");
        }
        return res.toString();
    }
}
