package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Home on 20.02.2016.
 */
class BelarusianHen extends  Hen
{
    int eggs = 1;
    @Override
    int getCountOfEggsPerMonth() {
        return eggs;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " +Country.BELARUS + ". Я несу " + eggs + " яиц в месяц.";
    }
}