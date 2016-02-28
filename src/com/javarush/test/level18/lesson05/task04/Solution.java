package com.javarush.test.level18.lesson05.task04;

/* Реверс файла
Считать с консоли 2 имени файла: файл1, файл2.
Записать в файл2 все байты из файл1, но в обратном порядке
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream inputFile = new FileInputStream(reader.readLine());
        FileOutputStream outFile = new FileOutputStream(reader.readLine());
        reader.close();
        byte[] buff = new byte[inputFile.available()];

        inputFile.read(buff,0,buff.length);
        inputFile.close();

        for (int i = buff.length - 1; i >= 0; i--) {
            outFile.write(buff[i]);
        }

        outFile.close();

    }
}
