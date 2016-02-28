package com.javarush.test.level05.lesson12.home05;

/* Вводить с клавиатуры числа и считать их сумму
Вводить с клавиатуры числа и считать их сумму, пока пользователь не введёт слово «сумма». Вывести на экран полученную сумму.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.text.NumberFormat;

public class Solution {

    public static void main(String[] args) throws Exception {
        int sum = 0;

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));


        while (true) {
            String s = reader.readLine();

            if (!s.equals("сумма")) {
                if (checkString(s)) {
                    sum += Integer.parseInt(s);
                }
            }
            else{
                break;
            }
        }


        System.out.println(sum);

        //напишите тут ваш код
    }

    public static boolean checkString(String s) {
        try {
            Integer.parseInt(s);
            //System.out.println("ok " + s);
        } catch (Exception e) {
            // System.out.println("NO " + s);
            return false;
        }
        return true;
    }


}
