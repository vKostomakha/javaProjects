package com.javarush.test.level05.lesson09.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя конструкторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog {
    private String name;
    private int height;
    private int color;

    public  Dog(String name) {
        this.name = name;
    }

    public  Dog(String name, int height) {
        this.height = height;
        this.name = name;
    }

    public  Dog(String name, int height, int color) {
        this.height = height;
        this.name = name;
        this.color = color;
    }
    //напишите тут ваш код

}
