package com.javarush.test.level08.lesson11.home06;

/* Вся семья в сборе
1. Создай класс Human с полями имя (String), пол (boolean), возраст (int), дети (ArrayList<Human>).
2. Создай объекты и заполни их так, чтобы получилось: два дедушки, две бабушки, отец, мать, трое детей.
3. Вывести все объекты Human на экран.
*/

import java.util.ArrayList;

public class Solution {
    public static void main(String[] args) {

        ArrayList<Human> childC = new ArrayList<>();
        ArrayList<Human> childChild = new ArrayList<>();
        ArrayList<Human> fathterChild =  new ArrayList<>();
        ArrayList<Human> motherChild =  new ArrayList<>();

        Human child1 = new Human("Аня",false,13,childC);
        Human child2 = new Human("Вася",true,9,childC);
        Human child3 = new Human("Ваня",true,5,childC);

        childChild.add(child1);
        childChild.add(child2);
        childChild.add(child3);

        Human mother = new Human("Вера",false,40,childChild);
        Human father = new Human("Георгий",true,43,childChild);

        fathterChild.add(father);
        motherChild.add(mother);

        Human grandFather1 = new Human("Вася",true, 60,fathterChild);
        Human grandMother1 = new Human("Инна",false, 60,fathterChild);

        Human grandFather2 = new Human("Николай",true, 60,motherChild);
        Human grandMother2 = new Human("Лариса",false, 60,motherChild );

        System.out.println(grandFather1.toString());
        System.out.println(grandFather2.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());


    }


    public static class Human {
        String name;
        boolean sex;
        int age;
        ArrayList<Human> children;

        Human(String name, boolean sex, int age, ArrayList<Human> children) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.children = children;
        }


        public String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            int childCount = this.children.size();
            if (childCount > 0) {
                text += ", дети: " + this.children.get(0).name;

                for (int i = 1; i < childCount; i++) {
                    Human child = this.children.get(i);
                    text += ", " + child.name;
                }
            }

            return text;
        }
    }

}
