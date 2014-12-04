package ua.artcode;

import com.sun.xml.internal.messaging.saaj.util.ByteInputStream;
import com.sun.xml.internal.messaging.saaj.util.ByteOutputStream;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Created with IntelliJ IDEA.
 * User: КЕП
 * Date: 02.12.14
 * Time: 19:36
 * To change this template use File | Settings | File Templates.
 */
public class DeepSerializeCopy {

    public static Object deepClone (Object obj){
        ByteOutputStream bos = new ByteOutputStream();


        try {
        ObjectOutputStream oos = new ObjectOutputStream(bos);
        oos.writeObject(obj);
            byte [] buff = bos.getBytes();
            ByteInputStream bis = new ByteInputStream(bos.getBytes(),buff.length );
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object clone = ois.readObject();


    } catch (IOException ex){
            ex.printStackTrace();
        } catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
        return null;
    }
}
