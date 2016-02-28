package com.javarush.test.level10.lesson11.home06;

/* Конструкторы класса Human
Напиши класс Human с 6 полями. Придумай и реализуй 10 различных конструкторов для него. Каждый конструктор должен иметь смысл.
*/

public class Solution
{
    public static void main(String[] args)
    {

    }

    public static class Human
    {
        String name;
        int age;
        boolean sex;
        String city;
        Human wife;
        Human[] childrens;

        Human(){}
        Human(String name){
            this.name = name;
        }
        Human(String name,int age){
            this.name = name;
            this.age = age;
        }
        Human(String name,int age,boolean sex){
            this.name = name;
            this.age = age;
            this.sex = sex;
        }
        Human(String name,int age,boolean sex,String city){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.city = city;
        }
        Human(String name,int age,boolean sex,String city,Human wife){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.city = city;
            this.wife = wife;
        }
        Human(String name,int age,boolean sex,String city,Human wife, Human[] childrens){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.city = city;
            this.wife = wife;
            this.childrens = childrens;
        }
        Human(String name,int age,boolean sex,Human wife){
            this.name = name;
            this.age = age;
            this.sex = sex;
            this.wife = wife;
        }
        Human(int age,boolean sex,Human wife){
            this.age = age;
            this.sex = sex;
            this.wife = wife;
        }
        Human(int age,boolean sex,String city,Human wife){
            this.age = age;
            this.sex = sex;
            this.city = city;
            this.wife = wife;
        }


    }
}
