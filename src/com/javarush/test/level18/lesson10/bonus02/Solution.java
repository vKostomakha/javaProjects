package com.javarush.test.level18.lesson10.bonus02;

/* Прайсы
CrUD для таблицы внутри файла
Считать с консоли имя файла для операций CrUD
Программа запускается со следующим набором параметров:
-c productName price quantity
Значения параметров:
где id - 8 символов
productName - название товара, 30 chars (60 bytes)
price - цена, 8 символов
quantity - количество, 4 символа
-c  - добавляет товар с заданными параметрами в конец файла, генерирует id самостоятельно, инкрементируя максимальный id, найденный в файле

В файле данные хранятся в следующей последовательности (без разделяющих пробелов):
id productName price quantity
Данные дополнены пробелами до их длины

Пример:
19846   Шорты пляжные синие           159.00  12
198478  Шорты пляжные черные с рисунко173.00  17
19847983Куртка для сноубордистов, разм10173.991234
*/


import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution {


    public static void main(String[] args) throws Exception {


        Scanner scanner = new Scanner(System.in);
        File file = new File(scanner.nextLine());
        scanner.close();

        ArrayList<String> lines = readFile(file); // Коллекция для строк, записанных в файл до запуска программы

        if (args.length < 4)
            return;

        if (args[0].equals("-c")) {

            String id = getLastId(lines);

            StringBuilder name= new StringBuilder();

            name.append(args[1]);
            if(args.length > 4){
                for(int i = 2; i < args.length-2; i++)
                {
                    name.append(" ");
                    name.append(args[i]);
                }
            }

            String fullName = name.toString();
            String price = args[args.length-2];
            String quan = args[args.length-1];


            BufferedWriter fw = new BufferedWriter(new FileWriter(file,true));


            String addString = addSpace(id, 8) + addSpace(fullName, 30) + addSpace(price, 8) + addSpace(quan, 4);
            fw.write(addString);
            fw.newLine();

            fw.flush();
            fw.close();
        }
    }

    private static ArrayList<String> readFile(File file) throws IOException {

        ArrayList<String> result = new ArrayList<>();
        BufferedReader reader = new BufferedReader(new FileReader(file));
        String s;
        while (( s = reader.readLine())!= null) {
            result.add(s);
        }
        reader.close();

        return result;
    }


    private static String getLastId(ArrayList<String> lines) {

        long max = 0;
        if (lines.size() > 0 ) {
            for (String line : lines) {
                long id = Long.parseLong(line.substring(0, 8).trim());
                if (id > max){
                    max = id;
                }
            }
        }
        max++;
        return String.valueOf(max);
    }


    protected static String addSpace(String parametr, int lenght) {

        StringBuilder nParam = new StringBuilder();
        nParam.append(parametr);
        if (parametr.length() < lenght) {

            for (int i = parametr.length(); i < lenght; i++) {

                nParam.append(" ");
            }
        }

        return nParam.toString();
    }
}
