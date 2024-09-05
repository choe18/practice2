package com.ex.sep5;

import java.util.Scanner;

public class Application5 {

    public static void main(String[] args) {

        /* 두 개의 정수를 입력 받아 변수에 저장하고,
         * 연산기호(+, -, *, /, %)를 입력 받아 해당 연산의 수행 결과를 출력하세요.
         * 단, 준비된 연산기호 외의 문자를 입력하는 경우 "입력하신 연산은 없습니다. 프로그램을 종료합니다." 출력 후 프로그램 종료
         *
         * -- 입력 예시 --
         * 첫 번째 정수 : 4
         * 두 번쨰 정수 : 3
         * 연산 기호를 입력하세요 : +
         *
         * -- 출력 예시 --
         * 4 + 3 = 7
         */

        Application5 app5 = new Application5();
        app5.testStatement();
    }

    public void testStatement() {

        System.out.print("첫 번째 정수를 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        int firstNum = sc.nextInt();

        System.out.print("두 번째 정수를 입력해주세요 : ");
        Scanner sc2 = new Scanner(System.in);
        int secondNum = sc2.nextInt();

        System.out.print("연산 기호를 입력하세요 : ");
        Scanner sc3 = new Scanner(System.in);
        char operator = sc3.next().charAt(0);


        int result = 0;


        if (operator == '+') {
            result = firstNum + secondNum;
        } else if (operator == '-') {
            result = firstNum - secondNum;
        } else if (operator == '*') {
            result = firstNum * secondNum;
        } else if (operator == '/') {
            result = firstNum / secondNum;
        } else if (operator == '%') {
            result = firstNum % secondNum;
        }

        System.out.println(firstNum + " " + operator + " " + secondNum + " = " + result);
    }
}
