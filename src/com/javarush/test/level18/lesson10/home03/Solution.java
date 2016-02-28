package com.javarush.test.level18.lesson10.home03;

/* Два в одном
Считать с консоли 3 имени файла
Записать в первый файл содержимого второго файла, а потом дописать в первый файл содержимое третьего файла
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException{

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileOutputStream file1 = new FileOutputStream(reader.readLine());
        FileInputStream file2  = new FileInputStream(reader.readLine());
        FileInputStream file3  = new FileInputStream(reader.readLine());
        reader.close();

        byte[] secondFileBuffer = new byte[file2.available()];
        byte[] thirdFileBuffer  = new byte[file3.available()];

        file2.read(secondFileBuffer,0,file2.available());
        file3.read(thirdFileBuffer,0,file3.available());

        file1.write(secondFileBuffer);
        file1.write(thirdFileBuffer,0,thirdFileBuffer.length);

        file2.close();
        file3.close();
        file1.close();
    }
}
