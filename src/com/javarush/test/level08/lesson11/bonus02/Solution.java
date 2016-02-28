package com.javarush.test.level08.lesson11.bonus02;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Нужно добавить в программу новую функциональность
Задача: Программа определяет, какая семья (фамилию) живёт в доме с указанным номером.
Новая задача: Программа должна работать не с номерами домов, а с городами:
Пример ввода:
Москва
Ивановы
Киев
Петровы
Лондон
Абрамовичи

Лондон

Пример вывода:
Абрамовичи
*/

//public class Solution
//{
//    public static void main(String[] args) throws IOException
//    {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//
//        //list of addresses
//        List<String> addresses = new ArrayList<String>();
//        while (true)
//        {
//            String family = reader.readLine();
//            if (family.isEmpty()) break;
//
//            addresses.add(family);
//        }
//
//        //read home number
//        int houseNumber = Integer.parseInt(reader.readLine());
//
//        if (0 <= houseNumber && houseNumber < addresses.size())
//        {
//            String familySecondName = addresses.get(houseNumber);
//            System.out.println(familySecondName);
//        }
//    }
//}


//public class Solution {
//    public static void main(String[] args) throws IOException {
//        //создадим метод чтения с клавиатуры
//        // String s = readText();
//        // System.out.println(s);
//
//        //создадим map со списком Фамилий - Городов
//        Map<String, String> map = mapCreate();
//
//
//        //запрашиваем город
//        String city = readText();
//
//        //ищем пару ключ - значение и печатаем там же
//        searchCity(city, map);
//    }
//
//    private static void searchCity(String s, Map<String, String> map) {
//        for (Map.Entry<String, String> pair : map.entrySet()) {
//            if (pair.getKey().equals(s)) {
//
//                System.out.println(pair.getValue());
//
//            }
//        }
//    }
//
//    private static Map<String, String> mapCreate() throws IOException {
//
//        Map<String, String> map = new HashMap<>();
//
//        while (true){
//            String s1= readText();
//            if (s1.isEmpty()) break;
//            else {
//                String s2 = readText();
//                map.put(s1,s2);
//            }
//        }
//
//        return map;
//    }
//
//    private static String readText() throws IOException {
//        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
//        return reader.readLine();
//    }
//
//}



public class Solution
{
    public static void main(String[] args) throws IOException
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        //Создадим карту и внесем в неё список в формате Город-Фамилия
        HashMap<String,String> map = new HashMap<String, String>();
        //считаем с клавиатуры и запишем данные

        while (true){
            String s1= reader.readLine();
            if (s1.isEmpty()) break;
            else {
                String s2 = reader.readLine();
                map.put(s1,s2);
            }
        }


        //узнаем вопрос про город
        String city = reader.readLine();

        //выводим город
        for (Map.Entry<String,String> pair : map.entrySet()){
            if (pair.getKey().equals(city)) System.out.println(pair.getValue());
        }

    }
}