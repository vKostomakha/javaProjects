package com.javarush.test.level05.lesson07.task03;

/* Создать класс Dog
Создать класс Dog (собака) с тремя инициализаторами:
- Имя
- Имя, рост
- Имя, рост, цвет
*/

public class Dog
{
    private String name;
    private int height;
    private int color;

    public  void initialize(String name){
        this.name = name;
    }
    public  void initialize(String name, int height){
        this.height = height;
        this.name = name;
    }
    public  void initialize(String name, int height, int color){
        this.height = height;
        this.name = name;
        this.color = color;
    }
    //напишите тут ваш код

}
