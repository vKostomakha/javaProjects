package com.javarush.test.level07.lesson06.task01;

import java.util.ArrayList;

/* 5 различных строчек в списке
1. Создай список строк.
2. Добавь в него 5 различных строчек.
3. Выведи его размер на экран.
4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.
*/
public class Solution
{


    public static void main(String[] args) throws Exception
    {
        ArrayList<String> s = new ArrayList<String>();

        for (int i = 0; i < 5 ; i++) {
            s.add(Integer.toString(i));
        }
        System.out.println(s.size());
        for (int j = 0; j < s.size() ; j++) {
            System.out.println(s.get(j));
        }
        //напишите тут ваш код

    }
}
