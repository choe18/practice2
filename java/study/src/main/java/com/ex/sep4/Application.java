package com.ex.sep4;

public class Application {

    public static void main(String[] args) {

        Caculator calc = new Caculator();
        calc.checkMethod();

//        String check = calc.checkMethod();
//        System.out.println(check);


        int sum = calc.sum1to10();
        System.out.println(sum);

        int sum2 = calc.sumTwoNumber(3,5);
        System.out.println(sum2);

        int sum3 = calc.minusTwoNumber(10,5);
        System.out.println(sum3);

        calc.checkMaxNumber(10,50);

    }
}
