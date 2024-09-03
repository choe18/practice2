package com.ohgiraffers.level02.normal;

public class Application1 {

    public static void main(String[] args) {

        /* 국어점수 80.5점, 수학점수 50.6점, 영어점수 70.8점을 실수 형태로 저장한 뒤
         * 총점과 평균을 정수 형태로 출력하세요
         *
         * -- 출력 예시 --
         * 총점 : 201
         * 평균 : 67
         *  */

        double dnum1 = 80.5;
        double dnum2 = 50.6;
        double dnum3 = 70.8;

        double result1 = dnum1 + dnum2 + dnum3;
        System.out.println(result1);

        int score1 = (int)result1;
        System.out.println(score1);

        System.out.println(score1 / 3);
    }
}
