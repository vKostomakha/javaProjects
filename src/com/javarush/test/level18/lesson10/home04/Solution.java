package com.javarush.test.level18.lesson10.home04;

/* Объединение файлов
Считать с консоли 2 имени файла
В начало первого файла записать содержимое второго файла так, чтобы получилось объединение файлов
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String fileName1 = reader.readLine();
        String fileName2 = reader.readLine();
        reader.close();
        FileInputStream file1 = new FileInputStream(fileName1);

        byte[] firstFileBuff = new byte[file1.available()];
        file1.read(firstFileBuff,0,firstFileBuff.length);
        file1.close();

        FileOutputStream file1Out = new FileOutputStream(fileName1);
        FileInputStream file2 = new FileInputStream(fileName2);

        byte[] secondFileBuff = new byte[file2.available()];
        file2.read(secondFileBuff,0,secondFileBuff.length);
        file2.close();

        file1Out.write(secondFileBuff);
        file1Out.write(firstFileBuff);

        file1Out.close();
    }
}
