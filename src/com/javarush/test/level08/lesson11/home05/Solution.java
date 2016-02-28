package com.javarush.test.level08.lesson11.home05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/* Мама Мыла Раму. Теперь с большой буквы
Написать программу, которая вводит с клавиатуры строку текста.
Программа заменяет в тексте первые буквы всех слов на заглавные.
Вывести результат на экран.

Пример ввода:
  мама     мыла раму.

Пример вывода:
  Мама     Мыла Раму.
*/

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = toTitleCase(reader.readLine());

        System.out.println(s);
        //напишите тут ваш код
    }

    public static String toTitleCase(String s) {

        char[] ch = s.toCharArray();
        StringBuilder titleCase = new StringBuilder();
        boolean nextLittleCase = false;

        for (int i = 0; i < ch.length;i++ ) {

            if (Character.isAlphabetic(ch[i]) & !nextLittleCase) {
                ch[i] = Character.toTitleCase(ch[i]);
                nextLittleCase = true;
            }
            else if(Character.isSpaceChar(ch[i])){
                nextLittleCase = false;
            }
            titleCase.append(ch[i]);
        }

        return titleCase.toString();
    }


}
