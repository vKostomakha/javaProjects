package com.javarush.test.level12.lesson02.task04;

/* Или «Кошка», или «Собака», или «Птица», или «Лампа»
Написать метод, который определяет, объект какого класса ему передали, и выводит на экран одну из надписей: Кошка, Собака, Птица, Лампа.
*/

public class Solution
{
    public static void main(String[] args)
    {
        printObjectType(new Cat());
        printObjectType(new Bird());
        printObjectType(new Lamp());
        printObjectType(new Cat());
        printObjectType(new Dog());
    }

    public static void printObjectType(Object o)
    {
        System.out.println(o.toString());
    }

    public static class Cat
    {
        @Override
        public String toString() {
            return "Кошка";
        }
    }

    public static class Dog
    {
        @Override
        public String toString() {
            return "Собака";
        }
    }

    public static class Bird
    {
        @Override
        public String toString() {
            return "Птица";
        }
    }

    public static class Lamp
    {
        @Override
        public String toString() {
            return "Лампа";
        }
    }
}