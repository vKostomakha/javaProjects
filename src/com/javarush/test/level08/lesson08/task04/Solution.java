package com.javarush.test.level08.lesson08.task04;

import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/* Удалить всех людей, родившихся летом
Создать словарь (Map<String, Date>) и занести в него десять записей по принципу: «фамилия» - «дата рождения».
Удалить из словаря всех людей, родившихся летом.
*/

public class Solution {
    public static void main(String[] args) {
        HashMap<String, Date> map = createMap();
        removeAllSummerPeople(map);
        for (Map.Entry<String, Date> pair : map.entrySet()
                ) {
            System.out.println(pair.getValue());
        }
    }

    public static HashMap<String, Date> createMap() {
        HashMap<String, Date> map = new HashMap<String, Date>();

        map.put("Stallone", new Date("JUNE 1 1980"));
        map.put("Stallone1", new Date("JUNE 1 1980"));
        map.put("Stallone2", new Date());
        map.put("Stallone3", new Date());
        map.put("Stallone4", new Date());
        map.put("Stallone5", new Date());
        map.put("Stallone6", new Date());
        map.put("Stallone7", new Date());
        map.put("Stallone8", new Date());
        map.put("Stallone9", new Date());

        return map;
    }

    public static void removeAllSummerPeople(HashMap<String, Date> map) {

        Iterator<Map.Entry<String, Date>> it = map.entrySet().iterator();

        while (it.hasNext()) {
            Map.Entry<String, Date> pair = it.next();
            if (pair.getValue().getMonth() > 4 & pair.getValue().getMonth() < 8) {
                it.remove();
            }

        }

    }
}
