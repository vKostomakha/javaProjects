package com.javarush.test.level08.lesson08.task03;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* Одинаковые имя и фамилия
Создать словарь (Map<String, String>) занести в него десять записей по принципу «Фамилия» - «Имя».
Проверить сколько людей имеют совпадающие с заданным имя или фамилию.
*/

public class Solution {

    public static void main(String[] args) {
        HashMap<String,String> map = createMap();
        int nCounter,sCounter;

        nCounter = getCountTheSameFirstName(map,"4");
        sCounter = getCountTheSameFirstName(map,"2");

    }
    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            String s = ("" + i);
            map.put(s, s);
        }

        //напишите тут ваш код
        return map;
    }

    public static int getCountTheSameFirstName(HashMap<String, String> map, String name) {
        int counter = 0;
        for (Map.Entry<String, String> k : map.entrySet()
                ) {
            if(k.getValue().equals(name)) counter++;
        }

        return counter;
    }

    public static int getCountTheSameLastName(HashMap<String, String> map, String lastName) {

        int counter = 0;
        for (Map.Entry<String, String> k : map.entrySet()
                ) {
            if(k.getKey().equals(lastName)) counter++;
        }
        return counter;
    }
}
