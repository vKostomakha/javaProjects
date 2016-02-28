package com.javarush.test.level08.lesson11.home09;

import java.text.*;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;

/* Работа с датой
1. Реализовать метод isDateOdd(String date) так, чтобы он возвращал true, если количество дней с начала года - нечетное число, иначе false
2. String date передается в формате MAY 1 2013
Не забудьте учесть первый день года.
Пример:
JANUARY 1 2000 = true
JANUARY 2 2020 = false
*/

public class Solution {
    public static void main(String[] args) throws Exception {
//        boolean result = isDateOdd("JANUARY 2 2000");
//        System.out.println(result);
    }

    public static boolean isDateOdd(String date) throws ParseException {

        DateFormat format;
        format = new SimpleDateFormat("MMMMMMMM dd yyyy", Locale.ENGLISH);
        Date d = format.parse(date);
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(d);
        int day = calendar.get(Calendar.DAY_OF_YEAR);

        if (day % 2 == 0) {
            return false;
        } else {
            return true;
        }

    }

}

