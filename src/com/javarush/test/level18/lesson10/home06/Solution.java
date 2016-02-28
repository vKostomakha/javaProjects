package com.javarush.test.level18.lesson10.home06;

/* Встречаемость символов
Программа запускается с одним параметром - именем файла, который содержит английский текст.
Посчитать частоту встречания каждого символа.
Отсортировать результат по возрастанию кода ASCII (почитать в инете). Пример: ','=44, 's'=115, 't'=116
Вывести на консоль отсортированный результат:
[символ1]  частота1
[символ2]  частота2
Закрыть потоки. Не использовать try-with-resources

Пример вывода:
, 19
- 7
f 361
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        if (args.length > 0) {


            String fileName = args[0];

            FileInputStream fileReader = new FileInputStream(fileName);

            byte[] bytes = new byte[255];
            char[] symbols = new char[255];
            while (fileReader.available() > 0) {

                byte b = (byte) fileReader.read();
                bytes[b]++;
                symbols[b] = (char) b;
            }

            fileReader.close();

            for (int i = 0; i < bytes.length; i++) {

                if (bytes[i] != 0) {

                    System.out.println(String.valueOf(symbols[i]) + " " + bytes[i]);
                }
            }

        }
    }
}

