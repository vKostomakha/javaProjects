package com.javarush.test.level18.lesson05.task03;

/* Разделение файла
Считать с консоли три имени файла: файл1, файл2, файл3.
Разделить файл1 по следующему критерию:
Первую половину байт записать в файл2, вторую половину байт записать в файл3.
Если в файл1 количество байт нечетное, то файл2 должен содержать бОльшую часть.
Закрыть потоки. Не использовать try-with-resources
*/

import java.io.*;

public class Solution {
    public static void main(String[] args) throws IOException {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        FileInputStream fReader = new FileInputStream(reader.readLine());
        FileOutputStream fWrite2 = new FileOutputStream(reader.readLine());
        FileOutputStream fWrite3 = new FileOutputStream(reader.readLine());
        reader.close();

        int ava = fReader.available();
        int length1 = (ava%2 == 0) ? ava/2:(ava/2) + 1;
        int lenght2 = ava - length1;
        System.out.println(lenght2);

        byte[] firstPart = new byte[length1];
        byte[] secondPart = new byte[lenght2];


            fReader.read(firstPart, 0, length1);
            fReader.read(secondPart,0, lenght2);

            fWrite2.write(firstPart);
            fWrite3.write(secondPart);


        fReader.close();
        fWrite2.close();
        fWrite3.close();

    }
}


