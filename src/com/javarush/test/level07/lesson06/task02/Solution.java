package com.javarush.test.level07.lesson06.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

/* Самая длинная строка
1. Создай список строк.
2. Считай с клавиатуры 5 строк и добавь в список.
3. Используя цикл, найди самую длинную строку в списке.
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

        for (int i = 0; i < max(n).size() ; i++) {
            System.out.println(s.get(max(n).get(i)));
        }

    }

    public static ArrayList<Integer> max(ArrayList<Integer> n){

        int max = n.get(0);
        ArrayList<Integer> out = new ArrayList<>();

        for (int i = 0; i <n.size() ; i++) {
            if(n.get(i) > max){
                max = n.get(i);
            }
        }

        for (int i = 0; i < n.size() ; i++) {
            if(n.get(i) == max){
                out.add(i);
            }
        }


        return out;
    }
}
