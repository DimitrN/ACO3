package ua.artcode.week8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * User: КЕП Date: 23.12.14 Time: 19:16
 */
public class TestHashMap {
    public static void main(String[] args) {

        // new HashSet <User> <=> new HashMap <User, null>
        Map<Integer, String> map = new HashMap<>();
        map.put(14, "Vanya");
        map.put(27, "Van");
        map.put(1, "Vano");
        map.put(25, "Iva");
        map.put(11, "Vova");
        map.put(17, "Vika");
        map.put(20, "Rom");
        map.put(null, "Zev");


        System.out.println(map.get(14));
        System.out.println(map.get(1));

        System.out.println(map.isEmpty());

        String name = map.remove(27);

        System.out.println(map.size());

        for(Integer key: map.keySet()){
            String value = map.get(key);
            System.out.printf("key = %s value = %s\n", key, value);

            Set <Map.Entry<Integer, String>> entrySet = map.entrySet();
            for (Map.Entry<Integer, String> entry : entrySet){
                System.out.printf("key = %s value = %s\n", entry.getKey(), entry.getValue());


            }

        }
    }

}

