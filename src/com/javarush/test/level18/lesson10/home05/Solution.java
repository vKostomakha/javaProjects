package com.javarush.test.level18.lesson10.home05;

/* Округление чисел
Считать с консоли 2 имени файла
Первый файл содержит вещественные(дробные) числа, разделенные пробелом. Например, 3.1415
Округлить числа до целых и записать через пробел во второй файл
Закрыть потоки. Не использовать try-with-resources
Принцип округления:
3.49 - 3
3.50 - 4
3.51 - 4
-3.49 - -3
-3.50 - -3
-3.51 - -4
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();

        FileInputStream fileReader = new FileInputStream(fileName1);
        FileOutputStream fileWriter = new FileOutputStream(fileName2);

        byte[] buffer = new byte[fileReader.available()];

        fileReader.read(buffer, 0, buffer.length);
        fileReader.close();
        String[] doubleValues = new String(buffer).split(" ");

        StringBuffer outString = new StringBuffer();
        int forInt = 0;
        for (String doubleValue : doubleValues) {
           if(Double.parseDouble(doubleValue) >= 0) {
               if (Double.parseDouble(doubleValue) - (int) Double.parseDouble(doubleValue) >= 0.5) {
                   forInt = (int) Double.parseDouble(doubleValue) + 1;
               } else {
                   forInt = (int) Double.parseDouble(doubleValue);
               }
           }
            else{
               if ((int) Double.parseDouble(doubleValue) - Double.parseDouble(doubleValue)  > 0.5) {
                   forInt = (int) Double.parseDouble(doubleValue) - 1;
               } else {
                   forInt = (int) Double.parseDouble(doubleValue);
               }

           }

            outString.append(forInt).append(" ");
        }

        byte[] outBuffer = String.valueOf(outString).getBytes();

        fileWriter.write(outBuffer);

        fileWriter.close();
    }
}
