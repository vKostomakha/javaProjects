package com.javarush.test.level05.lesson12.bonus03;

import java.io.*;

/* Задача по алгоритмам
Написать программу, которая:
1. вводит с консоли число N > 0
2. потом вводит N чисел с консоли
3. выводит на экран максимальное из введенных N чисел.
*/

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String s = reader.readLine();

            if (checkString(s) > 0) {

            int[] n = new int[Integer.parseInt(s)];

                for (int i = 0; i < n.length ; i++) {
                    String nS = reader.readLine();
                    if (checkStringN(nS)) {
                        n[i] = Integer.parseInt(nS);
                    }
                 }

            int maximum = max(n);
            System.out.println(maximum);
        }
    }

    public static int checkString(String s) {
        try {
            if (Integer.parseInt(s) > 0) {
                return Integer.parseInt(s);
            }
        } catch (Exception e) {
            return 0;
        }
        return 0;
    }

    public static boolean checkStringN(String s) {
        try {
            Integer.parseInt(s);
        } catch (Exception ex) {
            return false;
        }
        return true;
    }

    public static int max(int n[]) {
        int max = n[0];

        for (int i = 1; i < n.length ; i++) {
            if(n[i] > max){
                max = n[i];
            }
        }

        return max;
    }

}
