package com.javarush.test.level04.lesson06.task01;

/* Минимум двух чисел
Ввести с клавиатуры два числа, и вывести на экран минимальное из них.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int n1 = Integer.parseInt(reader.readLine());
        int n2 = Integer.parseInt(reader.readLine());
        //напишите тут ваш код

        System.out.println(minTwo(n1,n2));

    }

    public  static  int minTwo(int a, int b){
        if(a > b){ return  b;}
        else{ return  a;}
    }
}