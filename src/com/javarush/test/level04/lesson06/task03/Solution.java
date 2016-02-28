package com.javarush.test.level04.lesson06.task03;

/* Сортировка трех чисел
Ввести с клавиатуры три числа, и вывести их в порядке убывания.
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
        int max = maxTwo(n1,maxTwo(n2,n3));
        int min = minTwo(n1,minTwo(n2,n3));
        int middle = middle(n1,n2,n3);


        System.out.println(max);
        System.out.println(middle);
        System.out.println(min);



    }
    public  static  int maxTwo(int a, int b){
        if(a > b){ return  a;}
        else{ return  b;}
    }

    public  static  int minTwo(int a, int b){
        if(a > b){ return  b;}
        else{ return  a;}
    }

    public  static  int middle(int a, int b,int c){
        if( (a>b & a<c) || (a<b & a>c)){ return  a;}
        if( (b>a & b<c) || (b<a & b>c)){ return  b;}
        if( (c>a & c<b) || (c<a & c>b)){ return  c;}
        return  0;
    }

}
