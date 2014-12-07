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

    public static Object deepClone(Object obj){
        try{
// Obj -> BC -> buff
            ByteOutputStream bos = new ByteOutputStream();
            ObjectOutputStream oos = new ObjectOutputStream(bos);
            oos.writeObject(obj);
            byte[] buff = bos.getBytes();
//read from buff -> BC -> Object
            ByteInputStream bis = new ByteInputStream(buff, buff.length);
            ObjectInputStream ois = new ObjectInputStream(bis);
            Object clone = ois.readObject();
            return clone;
        } catch (IOException ex){
            ex.printStackTrace();
        } catch (ClassNotFoundException ex){
            ex.printStackTrace();
        }
        return null;
    }

}
