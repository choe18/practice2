package com.study.practice.chap01_02;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {

        // 문제 1. int를 byte로 강제 형변환 했을시 데이터가 손상되게 하라.

        int inum = 200;
        byte bnum = (byte) inum;

        System.out.println(inum);       // 200
        System.out.println(bnum);       // -56



        // 문제 2. 문자형 a를 int 정수형으로 자동변환 했을시 나오는 출력 값은?

        char ch;
        ch = 'a';

        int numA = (int)ch;
        System.out.println(numA);       // 97




        // 문제 3. 온라인 쇼핑몰에서 고객이 장바구니에 담은 총 금액에 따라 할인 혜택을 적용해야 합니다.
        // 장바구니 총 금액이 500,000원 이상이면 20% 할인을 적용합니다.
        // 장바구니 총 금액이 300,000원 이상 500,000원 미만이면 10% 할인을 적용합니다.
        // 장바구니 총 금액이 100,000원 이상 300,000원 미만이면 5% 할인을 적용합니다.
        // 장바구니 총 금액이 100,000원 미만이면 할인이 없습니다.
        // 단, 할인 후의 금액과 적용된 할인율을 출력해야 합니다.
        // 삼항 연산자를 사용하여 이 계산기를 구현하세요.

        

    }
}
