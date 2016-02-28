package com.javarush.test.level05.lesson12.bonus02;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/* Нужно добавить в программу новую функциональность
Задача: Программа вводит два числа с клавиатуры и выводит минимальное из них на экран.
Новая задача: Программа вводит пять чисел с клавиатуры и выводит минимальное из них на экран.
*/

public class Solution
{

    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int n[];
        int maxinput = 5;
        n = new int[maxinput];

        for (int i = 0; i < maxinput ; i++) {
            n[i] = Integer.parseInt(reader.readLine());
        }

        int minimum = min(n);

        System.out.println("Minimum = " + minimum);
    }


    public static int min(int[] n)
    {
        int min = n[0];
        for (int i = 0; i <n.length ; i++) {
            if(n[i] < min){
                min = n[i];
            }
        }
       return min;
    }

}
