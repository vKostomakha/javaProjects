package com.javarush.test.level15.lesson09.task01;

import java.util.HashMap;
import java.util.Map;

/* Статики 1
В статическом блоке инициализировать labels 5 различными парами.
*/

public class Solution {
    public static Map<Double, String> labels = new HashMap<Double, String>();

    static {
        labels.put(323.0,"q");
        labels.put(324.0,"w");
        labels.put(325.0,"e");
        labels.put(326.0,"r");
        labels.put(327.0,"t");
    }

    public static void main(String[] args) {
        System.out.println(labels);
    }
}
