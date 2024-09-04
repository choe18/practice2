package com.study.section1;

public class Caculator {

    public void checkMethod() {
        System.out.println("확인용 메소드");
    }

    public int sum1to10() {

        return (1+2+3+4+5+6+7+8+9+10);
    }

    public int sumTwoNumber(int first, int second) {

        return first + second;
    }

    public int minusTwoNumber(int first, int second) {
        return first - second;
    }

    public int checkMaxNumber(int a, int b) {
        int result = a > b ? a : b;
        return result;
    }


}
