package com.ex.sep5;

import java.util.Scanner;

public class Application6 {

    public static void main(String[] args) {

        /* 과일 이름("apple", "banana", "melon", "grape") 중 한 가지를 문자열로 입력하면
         * 해당하는 가격에 맞게 상품명과 가격이 출력되게 하세요.
         * 단, 목록에 없는 과일을 입력 시 "준비된 상품이 없습니다." 출력 후 프로그램 종료
         *
         * -- 상품 가격 --
         * apple :  1000원
         * banana : 3000원
         * melon : 2000원
         * grape : 5000원
         *
         * -- 입력 예시 --
         * 과일 이름을 입력하세요 : banana
         *
         * -- 출력 예시 --
         * banana의 가격은 3000원 입니다.
         * */


        Application6 app6 = new Application6();
        app6.testFruit();
    }

    public void testFruit() {
        System.out.println("--상품 가격--");
        System.out.println("apple : 1000원");
        System.out.println("banana : 3000원");
        System.out.println("melon : 2000원");
        System.out.println("grape : 5000원");

        System.out.print("과일 이름을 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        String fruit = sc.nextLine();

        String fruitName = "";
        int fruitPrice = 0;


        if (fruit.equals("apple")) {
            fruitName = "apple";
            fruitPrice = 1000;
        } else if (fruit.equals("banana")) {
            fruitName = "banana";
            fruitPrice = 3000;
        } else if (fruit.equals("melon")) {
            fruitName = "melon";
            fruitPrice = 2000;
        } else if (fruit.equals("grape")) {
            fruitName = "grape";
            fruitPrice = 5000;
        } else {
            System.out.println("준비된 상품이 없습니다.");
            return;
        }

        System.out.println(fruitName + "의 가격은 " + fruitPrice + "입니다.");
    }
}
