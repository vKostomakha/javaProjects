package com.javarush.test.level15.lesson12.home05;

/* Перегрузка конструкторов
1. В классе Solution создайте по 3 конструктора для каждого модификатора доступа.
2. В отдельном файле унаследуйте класс SubSolution от класса Solution.
3. Внутри класса SubSolution создайте конструкторы командой Alt+Insert -> Constructors.
4. Исправьте модификаторы доступа конструкторов в SubSolution так, чтобы они соответствовали конструкторам класса Solution.
*/

public class Solution {

    private int i, k, p;
    private double j, n, m;
    private String s, z, x;
    private Short a,b,c;

    Solution(){}

    public Solution(int i, int k, int p) {
        this.i = i;
        this.k = k;
        this.p = p;
    }

    public Solution(int i, int k) {
        this.i = i;
        this.k = k;
    }

    public Solution(int i) {
        this.i = i;
    }


    protected Solution(double j, double n, double m) {
        this.j = j;
        this.n = n;
        this.m = m;
    }

    protected Solution(double j, double n) {
        this.j = j;
        this.n = n;
    }

    protected Solution(double j) {
        this.j = j;
    }


    Solution(String s, String z, String x) {
        this.s = s;
        this.z = z;
        this.x = x;
    }

    Solution(String s, String z) {
        this.s = s;
        this.z = z;
    }




    private Solution(Number priv1){};
    private Solution(Boolean priv2){};
    private Solution(Float priv3){};

}

