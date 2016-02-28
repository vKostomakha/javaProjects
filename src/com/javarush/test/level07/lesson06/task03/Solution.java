package com.javarush.test.level07.lesson06.task03;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая короткая строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую короткую строку в списке.
4. Выведи найденную строку на экран.
5. Если таких строк несколько, выведи каждую с новой строки.
*/
public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> s = new ArrayList<>();
        ArrayList<Integer> n = new ArrayList<>();
        for (int i = 0; i < 5 ; i++) {
            s.add(reader.readLine());
            n.add(s.get(i).length());
        }

        for (int i = 0; i < min(n).size() ; i++) {
            System.out.println(s.get(min(n).get(i)));
        }

    }

    public static ArrayList<Integer> min(ArrayList<Integer> n){

        int min = n.get(0);
        ArrayList<Integer> out = new ArrayList<>();

        for (int i = 0; i <n.size() ; i++) {
            if(n.get(i) < min){
                min = n.get(i);
            }
        }

        for (int i = 0; i < n.size() ; i++) {
            if(n.get(i) == min){
                out.add(i);
            }
        }


        return out;
    }
}