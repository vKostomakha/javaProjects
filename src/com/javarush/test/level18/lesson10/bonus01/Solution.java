package com.javarush.test.level18.lesson10.bonus01;

/* Шифровка
Придумать механизм шифровки/дешифровки

Программа запускается с одним из следующих наборов параметров:
-e fileName fileOutputName
-d fileName fileOutputName
где
fileName - имя файла, который необходимо зашифровать/расшифровать
fileOutputName - имя файла, куда необходимо записать результат шифрования/дешифрования
-e - ключ указывает, что необходимо зашифровать данные
-d - ключ указывает, что необходимо расшифровать данные
*/
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class Solution {
    public static void main(String[] args) throws IOException{
        String fileName = args[1];
        String fileOutputName = args[2];

        try {
            FileInputStream fRead = new FileInputStream(fileName);
            FileOutputStream fWrite = new FileOutputStream(fileOutputName);
            byte[] buff = new byte[fRead.available()];
            fRead.read(buff);

            for(int i = 0; i < buff.length; i++)
                if(args[0].equals("-e")){
                    buff[i] *= 2;
                }else{
                    buff[i] /= 2;
                }

            fWrite.write(buff);
            fRead.close();
            fWrite.close();
        }catch(FileNotFoundException e){}
    }
}