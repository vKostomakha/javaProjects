package com.javarush.test.level04.lesson07.task04;

/* Положительные и отрицательные числа
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе,
в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б", где а, б - искомые значения.
Пример для чисел 2 5 6:
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример для чисел -2 -5 6:
количество отрицательных чисел: 2
количество положительных чисел: 1
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

        System.out.println("количество отрицательных чисел: " + counterMinus);
        System.out.println("количество положительных чисел: " + counterPlus);
    }


}
