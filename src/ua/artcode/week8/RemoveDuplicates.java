package ua.artcode.week8;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * User: КЕП Date: 23.12.14 Time: 19:49
 */
public class RemoveDuplicates {

    public static void main(String[] args) {
        String seq = "Kolya Vasyz Petya Kolya and some and some guys";

        HashSet<String> set = new LinkedHashSet<>();
        Collections.addAll(set, seq.split(" "));
        for (String str : set){
            System.out.print(str + " ");
        }
    }
}
