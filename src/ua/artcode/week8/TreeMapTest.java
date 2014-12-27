package ua.artcode.week8;

import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

/**
 * User: КЕП Date: 23.12.14 Time: 19:58
 */
public class TreeMapTest {

    public static void main(String[] args) {

        Comparator<String> stringComparator = new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o2.compareTo(o1);
            }
        };

        Map<String, int[]> map = new TreeMap<>(stringComparator);
        map.put("Oleg", new int[] {1,2,3});
        map.put("Ivan", new int[] {1,2,3});
        map.put("Kolya", new int[] {1,2,3});
        map.put("Yura", new int[] {1,2,3});
        map.put("Viktor", new int[] {1,2,3});
        map.put("Nick", new int[] {1,2,3});



        for (String key : map.keySet()){
            System.out.println(key);
        }

    }
}
