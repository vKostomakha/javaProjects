package com.javarush.test.level07.lesson12.home06;

/* Семья
Создай класс Human с полями имя(String), пол(boolean),возраст(int), отец(Human), мать(Human). Создай объекты и заполни их так, чтобы получилось: Два дедушки, две бабушки, отец, мать, трое детей. Вывести объекты на экран.
Примечание:
Если написать свой метод String toString() в классе Human, то именно он будет использоваться при выводе объекта на экран.
Пример вывода:
Имя: Аня, пол: женский, возраст: 21, отец: Павел, мать: Катя
Имя: Катя, пол: женский, возраст: 55
Имя: Игорь, пол: мужской, возраст: 2, отец: Михаил, мать: Аня
…
*/

public class Solution {
    public static void main(String[] args) {

        Human grandMother1 = new Human("Katya1", false, 60, null, null);
        Human grandMother2 = new Human("Katya2", false, 60, null, null);

        Human grandFather1 = new Human("Vasya1", true, 60, null, null);
        Human grandFather2 = new Human("Vasya2", true, 60, null, null);


        Human father = new Human("Petya", true, 30, grandMother1, grandFather1);
        Human mother = new Human("Galya", true, 29, grandMother2, grandFather2);

        Human child1 = new Human("Kolya", true, 13, mother, father);
        Human child2 = new Human("Jenya", true, 9, mother, father);
        Human child3 = new Human("Alina", true, 6, mother, father);


        System.out.println(grandFather1.toString());

        System.out.println(grandFather2.toString());
        System.out.println(grandMother1.toString());
        System.out.println(grandMother2.toString());
        System.out.println(father.toString());
        System.out.println(mother.toString());
        System.out.println(child1.toString());
        System.out.println(child2.toString());
        System.out.println(child3.toString());

        //напишите тут ваш код
    }

    public static class Human {
        String name;
        boolean sex;
        int age;
        Human mother;
        Human father;
        //напишите тут ваш код

        public Human(String name, boolean sex, int age, Human mother, Human father) {
            this.name = name;
            this.sex = sex;
            this.age = age;
            this.mother = mother;
            this.father = father;
        }

        public  String toString() {
            String text = "";
            text += "Имя: " + this.name;
            text += ", пол: " + (this.sex ? "мужской" : "женский");
            text += ", возраст: " + this.age;

            if (this.father != null)
                text += ", отец: " + this.father.name;

            if (this.mother != null)
                text += ", мать: " + this.mother.name;

            return text;
        }
    }
}
