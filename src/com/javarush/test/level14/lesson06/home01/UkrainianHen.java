package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Home on 20.02.2016.
 */
class UkrainianHen extends  Hen
{
    int eggs = 4;
    @Override
    int getCountOfEggsPerMonth() {
        return eggs;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " +Country.UKRAINE + ". Я несу " + eggs + " яиц в месяц.";
    }
}