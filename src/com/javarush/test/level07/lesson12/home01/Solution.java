package com.javarush.test.level07.lesson12.home01;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;





/* Вывести числа в обратном порядке
Ввести с клавиатуры 10 чисел и заполнить ими список.
Вывести их в обратном порядке.
Использовать только цикл for.
*/

public class Solution {

   public static void main(String[] args)  throws IOException  {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> iList = new ArrayList<>();

        for (int i = 0; i < 10; i++) {
            iList.add(Integer.parseInt(reader.readLine()));
        }

        //System.out.println(iList.size());

        for (int i = iList.size() - 1; i >= 0 ; i--) {
            System.out.println(iList.get(i));
        }


        //напишите тут ваш код
    }
}
