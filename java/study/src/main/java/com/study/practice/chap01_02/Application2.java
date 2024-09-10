package com.study.practice.chap01_02;

public class Application2 {

    public static void main(String[] args) {

        // 문제 1. 화씨를 섭씨로 바꾸는 코드 작성하세요
        // (공식) - (화씨 − 32) × 5/9 = °C , 섭씨는 강제 형변환으로 정수로 출력

        double num1 = 81.8;
        double result = (num1 - 32) * 5/9;

        int num2 = (int)result;

        System.out.println(num2);       // 27


        // 문제 2. 공을 전부 넣기 위해 필요한 상자의 개수를 구하세요 . 상자 하나당 공은5개가 들어감
        // 삼항 연산자 사용
        // ex) 공이 23개면 상자는 5개가 필요

        int ball = 43;
        String less = "공을 5개 이상 넣어주세요";
        int box = (ball >= 5)? ball / 5 : 1;

        System.out.println("공을 모두 넣기 위해 필요한 상자는 " + box + "개 입니다.");
        // 공을 모두 넣기 위해 필요한 상자는 8개 입니다.
    }
}
