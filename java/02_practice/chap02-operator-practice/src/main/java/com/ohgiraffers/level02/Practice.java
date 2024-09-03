package com.ohgiraffers.level02;

public class Practice {

    public static void main(String[] args) {

//        실수형 변수를 선언하고 해당 값을 정수로 변환한 뒤
//        삼항 연산자를 사용하여 값이 100보다 작으면 min, 100보다 크면 max를 출력하는 프로그램을 작성하세요

        double dnum = 121.3;
        int num = (int) dnum;
        System.out.println(num);

        String result = (num < 100)? "min" : "max";
        System.out.println(result);


        System.out.println("====================================");


//        1. Pi를 상수로 3.14로 설정하고 초기화하세요.  반지름을 5로 선언 및 초기화 한 후 원의 넓이를 구하세요.
//        2. 나이를 정수로 선언하고 삼항연산자를 사용하여 19세 이상이면 성인, 미만이면 미성년자로 나오도록 구현하세요

        System.out.println("1.");
        final double Pi = 3.14;
        System.out.println(Pi);

        int circle = 5;
        System.out.println("원의 넓이 : " + circle*circle*Pi);


        System.out.println("2.");
        int age = 24;
        System.out.println(age);

        String result1 = (age >= 19)? "성인" : "미성년자";
        System.out.println(result1);


        System.out.println("=================================");
//        정수 (10 , 20, 30 , 40) 4개를 변수로 선언한 후 실수로 변환하여 최대값 과 최소값을 삼향연산자로 출력한 뒤
//        최대값과 최소값의 차이값을 출력하시오.
        int a = 10;
        int b = 20;
        int c = 30;
        int d = 40;

        int max, min;
        max = (d > a && d > b && d > c)? d : (c > b && c > a)? c : (b > a)? b : a;
        System.out.println("최대값 : " + max);
        min = (a < b && a < c && a < d)? a : (b < c && b < d)? b : (c < d)? c : d;
        System.out.println("최소값 : " + min);

        System.out.println("최대값과 최소값의 차이 : " + (max - min));

    }
}
