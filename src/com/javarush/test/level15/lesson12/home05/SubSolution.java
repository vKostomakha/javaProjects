package com.javarush.test.level15.lesson12.home05;

/**
 * Created by Home on 22.02.2016.
 */
public class SubSolution extends  Solution {

    private Short a,b,c;

    public SubSolution(int i, int k, int p) {
        super(i, k, p);
    }

    public SubSolution(int i, int k) {
        super(i, k);
    }

    public SubSolution(int i) {
        super(i);
    }


    protected SubSolution(double j, double n, double m) {
        super(j, n, m);
    }

    protected SubSolution(double j, double n) {
        super(j, n);
    }

    protected SubSolution(double j) {
        super(j);
    }

    SubSolution(String s, String z, String x) {
        super(s, z, x);
    }

    SubSolution(String s, String z) {
        super(s, z);
    }

    SubSolution() {

    }

    private SubSolution(Number priv1){};
    private SubSolution(Boolean priv2){};
    private SubSolution(Float priv3){};



}
