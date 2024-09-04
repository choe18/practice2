package com.study.practice;

import java.util.Random;

import java.util.Scanner;

public class Application1 {

    public static void main(String[] args) {

//        1. -50부터 50까지의 난수를 발생시키는 함수를 작성해보세요
        Random random = new Random();

        int A = random.nextInt(101) + -50;
        System.out.println("A = " + A);



        //스캐너를 사용하여 첫번째 숫자를 입력하고 두번째 숫자도 입력하여 두 숫자를 더한 값이 나오게 출력하세요.
        Scanner sc = new Scanner(System.in);

        System.out.println("첫 번째 숫자 : ");
        int num1 = sc.nextInt();
        System.out.println("입력하신 첫 번째 숫자는 " + num1 + "입니다.");

        System.out.println("두 번째 숫자 : ");
        int num2 = sc.nextInt();
        System.out.println("입력하신 두 번 째 숫자는 " + num2 + "입니다.");

        int result = num1 + num2;
        System.out.println("두 숫자를 더한 값은 " + result + "입니다.");



    }
}
