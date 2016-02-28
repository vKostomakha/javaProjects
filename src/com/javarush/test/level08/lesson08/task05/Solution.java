package com.javarush.test.level08.lesson08.task05;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* Удалить людей, имеющих одинаковые имена
Создать словарь (Map<String, String>) занести в него десять записей по принципу «фамилия» - «имя».
Удалить людей, имеющих одинаковые имена.
*/

public class Solution {

    public static void main(String[] args) {

        HashMap<String,String> map = createMap();

        removeTheFirstNameDuplicates(map);

        for (Map.Entry<String,String> pair : map.entrySet()
             ) {
            System.out.println(pair.getValue());
        }
    }

    public static HashMap<String, String> createMap() {
        HashMap<String, String> map = new HashMap<>();

        for (int i = 0; i < 10; i++) {
            String s = ("" + i);
            map.put(s, s);
        }
        //map.put("10", "1");
        //напишите тут ваш код
        return map;
    }

    public static void removeTheFirstNameDuplicates(HashMap<String, String> map) {

        ArrayList<String> mapList = new ArrayList<String>(map.values());

        for (String s : mapList) {
            int count = 0;
            for (int i = 0; i < mapList.size() ; i++) {
                if(s.equals(mapList.get(i))){
                    count++;
                }
                if(count > 1){
                    removeItemFromMapByValue(map,s);
                }
            }
        }

    }

    public static void removeItemFromMapByValue(HashMap<String, String> map, String value) {
        HashMap<String, String> copy = new HashMap<String, String>(map);
        for (Map.Entry<String, String> pair : copy.entrySet()) {
            if (pair.getValue().equals(value))
                map.remove(pair.getKey());
        }
    }
}
