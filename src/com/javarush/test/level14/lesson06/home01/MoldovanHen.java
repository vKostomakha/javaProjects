package com.javarush.test.level14.lesson06.home01;

/**
 * Created by Home on 20.02.2016.
 */
class MoldovanHen extends  Hen
{
    int eggs = 2;
    @Override
    int getCountOfEggsPerMonth() {
        return eggs;
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Моя страна - " +Country.MOLDOVA + ". Я несу " + eggs + " яиц в месяц.";
    }
}
