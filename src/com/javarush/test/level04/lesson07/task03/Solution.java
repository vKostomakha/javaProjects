package com.javarush.test.level04.lesson07.task03;

/* Положительные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел в исходном наборе.
Пример для чисел -4 6 6:
2
Пример для чисел -6 -6 -3:
0
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        int n3 = Integer.parseInt(reader.readLine());
        int counterPlus =0;
        int counterMinus =0;

        if(n1 >0){counterPlus++;}else{counterMinus++;}
        if(n2 >0){counterPlus++;}else{counterMinus++;}
        if(n3 >0){counterPlus++;}else{counterMinus++;}

        System.out.println(counterPlus);

    }
}
