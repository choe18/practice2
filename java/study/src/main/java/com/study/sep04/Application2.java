package com.study.sep04;

public class Application2 {

    public static void main(String[] args) {


        Caculator2 calc = new Caculator2();

        int result1 = calc.plusTwoNumbers(13,12);
        System.out.println(result1);

        int result2 = calc.minusTwoNumbers(50,30);
        System.out.println(result2);

        int result3 = calc.multipleTwoNumbers(5,7);
        System.out.println(result3);

        int result4 = calc.divideTwoNumbers(40,2);
        System.out.println(result4);

    }
}
