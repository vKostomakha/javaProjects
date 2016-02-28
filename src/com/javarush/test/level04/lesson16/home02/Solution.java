package com.javarush.test.level04.lesson16.home02;

import java.io.*;

/* Среднее такое среднее
Ввести с клавиатуры три числа, вывести на экран среднее из них. Т.е. не самое большое и не самое маленькое.
*/

public class Solution
{
    public static void main(String[] args)   throws Exception
    {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());

        System.out.println(middle(a,b,c));
        //напишите тут ваш код
    }
    public  static  int middle(int a, int b,int c){
        if( (a>b & a<c) || (a<b & a>c)){ return  a;}
        if( (b>a & b<c) || (b<a & b>c)){ return  b;}
        if( (c>a & c<b) || (c<a & c>b)){ return  c;}
        return  0;
    }
}
