package com.study.sep05;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {
        /*
        * 사용자로부터 정수를 입력 받아
        * 해당 정수가 양수이며
        * 100이상이며
        * 짝수일 때 true,
        * 홀수일 때 false를 출력하는 조건문을 작성하세요.
        *
        * 사용자가 100미만의 양수를 입력 했을 때
        * "100 이상의 양수를 입력하세요" 라는 문장이 출력되도록 하세요
        * */

        Application1 app1 = new Application1();
        app1.test();
    }

    public void test() {
        System.out.print("정수를 하나 입력하세요 : ");
        Scanner scanner1 = new Scanner(System.in);
        int Num = scanner1.nextInt();


        if (Num > 0 ) {
            if ( Num >= 100 ) {
                if ( Num % 2 == 0) {
                    System.out.println("true");
                } else if ( Num % 2 != 0 ) {
                    System.out.println("false");
                }
            } else {
                System.out.println("100이상의 양수를 입력하세요");
            }
        }
    }
}
