package com.javarush.test.level13.lesson11.home03;

/* Чтение файла
1. Считать с консоли имя файла.
2. Вывести в консоль(на экран) содержимое файла.
3. Не забыть освободить ресурсы. Закрыть поток чтения с файла и поток ввода с клавиатуры.
*/

import java.io.*;

public class Solution
{
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String txtName = reader.readLine();
        reader.close();

        InputStream inStream = new FileInputStream(txtName);
        OutputStream outStream  = new PrintStream(System.out);

        while(inStream.available() > 0){

            outStream.write(inStream.read());

        }

        outStream.close();
        inStream.close();
    }
}
