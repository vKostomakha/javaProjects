package com.javarush.test.level05.lesson12.home04;

/* Вывести на экран сегодняшнюю дату
Вывести на экран текущую дату в аналогичном виде "21 02 2014".
*/


import java.util.Calendar;

public class Solution {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance();

        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH) + 1;
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        String sMonth;
        String sDay;

        if (month < 10) {
            sMonth = "0" + Integer.toString(month);
        }
        else{
            sMonth = Integer.toString(month);
        }
        if (day < 10) {
            sDay = "0" + Integer.toString(day);
        }
        else{
            sDay = Integer.toString(day);
        }
        System.out.println(sDay + " " + sMonth + " " + year);
        //напишите тут ваш код
    }
}
