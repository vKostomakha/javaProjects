package com.javarush.test.level04.lesson06.task02;

/* Максимум четырех чисел
Ввести с клавиатуры четыре числа, и вывести максимальное из них.
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
        int n4 = Integer.parseInt(reader.readLine());
        int max = maxTwo(maxTwo(n1,n2),maxTwo(n3,n4));

        System.out.println(max);
    }

    public  static  int maxTwo(int a, int b){
        if(a > b){ return  a;}
        else{ return  b;}
    }
}
