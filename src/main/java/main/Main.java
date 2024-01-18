package main;

import calc.Calc;

public class Main {
    public static void main(String[] args) {
        Calc calc =new Calc();
        System.out.println(calc.sum(5,3));
        System.out.println(calc.sub(5, 3));
        System.out.println(calc.mult(5, 3));
        System.out.println(calc.div(5, 3));

    }
}
