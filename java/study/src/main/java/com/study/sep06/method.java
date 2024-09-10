package com.study.sep06;

import java.util.Scanner;

public class method {

    public void methodA() {

        //  7~15 사이의 난수를 발생시켜서 3부터 발생한 난수까지의 합계 구하기

        int random = (int) (Math.random() * 9) + 7;

        System.out.println("random = " + random);

        int sum = 0;

        for (int i = 3; i < random; i++) {
            sum += i;
        }

        System.out.println("3부터 발생한 " + random + "까지의 합 = " + sum);
    }

    public void methodB() {

//        팩토리얼을 계산하는 반복문 만들기  // 팩토리얼 : 곱한 값들
//        입력예시) 정수를 입력하세요 : 5

//        출력예시) 입력하신 숫자의 팩토리얼은 120 입니다

        Scanner sc = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int num = sc.nextInt();
//        long result = 1L;

        int sum = 1;  // int sum = 0; <- 이렇게 기입 시 *0이 되어버리기 때문에 1을 입력해줘야 함
        for( int i = 1; i <= num; i++) {
            sum *= i;
        }
        System.out.println(sum);


    }

    public void methodC() {

        /*for문을 사용하여 '*'을 출력해서 높이가 5인 삼각형을 만들어 보세요
         * 출력예시
         *              *
         ***
         *****
         *******
         *********

         * */

        int sum = 0;

        for ( int i = 1; i < 6; i++ ) {

            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}
