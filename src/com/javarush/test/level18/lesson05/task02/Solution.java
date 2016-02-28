package com.javarush.test.level18.lesson05.task02;

/* Подсчет запятых
С консоли считать имя файла
Посчитать в файле количество символов ',', количество вывести на консоль
Закрыть потоки. Не использовать try-with-resources

Подсказка: нужно сравнивать с ascii-кодом символа ','
*/

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fl = new FileInputStream(reader.readLine());
        reader.close();
        byte comma = 0x2C;
        long pointCounter = 0;
        while (fl.available() > 0){
           byte nByte = (byte)  fl.read();

            if(nByte == comma){
                pointCounter++;
            }
        }

        fl.close();
        System.out.println(pointCounter);

    }
}
