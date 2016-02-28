package com.javarush.test.level14.lesson08.bonus02;

/* НОД
Наибольший общий делитель (НОД).
Ввести с клавиатуры 2 целых положительных числа.
Вывести в консоль наибольший общий делитель.
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        int first = Integer.parseInt(reader.readLine());
        int second = Integer.parseInt(reader.readLine());

        int smaller = whatSmaller(first, second);
        int bigger  = whatBigger(first,second);
        int maxNod = 1;
        ArrayList<Integer> nodList = new ArrayList<>();

        for (int i = 1; i <= smaller; i++) {
            if (smaller % i == 0) {
                nodList.add(i);
            }
        }


        for (int i = nodList.size() - 1; i >= 0; i--) {

            if (bigger % nodList.get(i) == 0) {
                maxNod = nodList.get(i);
                break;
            }
        }

        System.out.println(maxNod);
    }


    private static int whatSmaller(int a, int b) {
        return (a < b) ? a : b;
    }
    private static int whatBigger(int a, int b) {
        return (a > b) ? a : b;
    }
}
