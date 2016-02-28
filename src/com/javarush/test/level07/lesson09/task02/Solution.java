package com.javarush.test.level07.lesson09.task02;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

/* Слова в обратном порядке
Введи с клавиатуры 5 слов в список строк. Удали 3 - ий элемент списка, и выведи оставшиеся элементы в обратном порядке.
*/

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> s = new ArrayList<>();

        for (int i = 0; i < 5 ; i++) {
            s.add(reader.readLine());
        }
        s.remove(2);
        for (int i = 0; i < s.size() ; i++) {
            int ind = s.size() - i - 1;
            System.out.println(s.get(ind));
        }
        //напишите тут ваш код

    }
}
