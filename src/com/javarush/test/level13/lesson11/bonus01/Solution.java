package com.javarush.test.level13.lesson11.bonus01;

/* Сортировка четных чисел из файла
1. Ввести имя файла с консоли.
2. Прочитать из него набор чисел.
3. Вывести на консоль только четные, отсортированные по возрастанию.
Пример ввода:
5
8
11
3
2
10
Пример вывода:
2
8
10
*/

import java.io.*;
import java.util.ArrayList;
import java.util.Collections;

public class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader   = new BufferedReader(new InputStreamReader(System.in));
        BufferedReader flReader = new BufferedReader(new FileReader(reader.readLine()));

        ArrayList<Integer> list  = new ArrayList<>();

        String num = reader.readLine();

        while ((num = flReader.readLine()) != null){
            int number = Integer.parseInt(num);
                if((number%2) == 0){
                list.add(number);
            }
        }

        reader.close();
        flReader.close();

        Collections.sort(list);

        for (Integer integer : list) {
            System.out.println(integer);
        }
    }
}
