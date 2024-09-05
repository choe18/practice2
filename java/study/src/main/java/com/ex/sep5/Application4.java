package com.ex.sep5;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        /* BMI(신체질량지수)를 계산하고, 계산된 값에 따라
         * 저체중(20 미만)인 경우 "당신은 저체중 입니다.",
         * 정상체중(20이상 25미만)인 경우 "당신은 정상체중 입니다.",
         * 과제충(25이상 30미만)인 경우 "당신은 과체중 입니다.",
         * 비만(30이상)인 경우 "당신은 비만 입니다." 를  출력하세요
         *
         * BMI 계산 방법은 체중(kg) / (신장(m) * 신장(m)) 이다.
         *
         * 계산 예시) BMI = 67 / (1.7 * 1.7)
         * */


        Application4 app4 = new Application4();
        app4.testBMI();
    }

    public void testBMI() {
        System.out.print("당신의 체중을 입력해주세요 : ");
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();

        System.out.print("당신의 신장을 m값으로 입력해주세요 : ");
        Scanner sc2 = new Scanner(System.in);
        double second = sc2.nextDouble();

        String result = "";

        if (first / (second * second) > 20) {
            result = "저체중";
        } else if (first / (second * second) >= 20 && first / (second * second) < 25) {
            result = "정상체중";
        } else if (first / (second * second) >= 25 && first / (second * second) < 30) {
            result = "과체중";
        } else if (first / (second * second) >= 30) {
            result = "비만";
        }

        System.out.println("당신은 " + result + "입니다.");
    }
}
