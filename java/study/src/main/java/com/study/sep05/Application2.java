package com.study.sep05;

import java.util.Scanner;

public class Application2 {

    public static void main(String[] args) {
        /*사용자로부터 세 개의 정수를 입력받아,
        이 세 정수로 구성된 삼각형의 유형을 판별하는 프로그램을 작성하세요.
        입력받은 세 정수가 삼각형의 세 변의 길이입니다.
        만약 변의 길이가 0보다 작을때 "변의 길이는 0보다 커야 합니다."가 출력이 되게 하세요.`

        정삼각형: 세 변의 길이가 모두 같을 때.

        이등변 삼각형: 두 변의 길이가 같고 나머지 한 변의 길이와 다를 때.

        부등변 삼각형: 세 변의 길이가 모두 다를 때.

        입력 예시

        첫 번째 변의 길이를 입력하세요 : 2

        두 번째 변의 길이를 입력하세요 : 3

        세 번째 변의 길이를 입력하세요 : 4

        출력 예시

        부등변삼각형 입니다.*/


        Application2 app2 = new Application2();
        app2.test();


    }

    public void test() {
        System.out.println("첫 번째 변의 길이를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int first = sc.nextInt();

        System.out.println("두 번째 변의 길이를 입력하세요 : ");
        Scanner sc1 = new Scanner(System.in);
        int second = sc1.nextInt();

        System.out.println("세 번째 변의 길이를 입력하세요 : ");
        Scanner sc2 = new Scanner(System.in);
        int third = sc2.nextInt();

        String result = "";

        if (first > 0 && second > 0 && third > 0) {
            if (first == second && first == third && second == third) {
                result = "정삼각형";
            } else if (first == second && first != third) {
                result = "이등변 삼각형";
            } else if (first == third && first != second) {
                result = "이등변 삼각형";
            } else if (second == first && second != third) {
                result = "이등변 삼각형";
            } else if (second == third && second != first) {
                result = "이등변 삼각형";
            } else if (third == first && third != second) {
                result = "이등변 삼각형";
            } else if (third == second && third != first) {
                result = "이등변 삼각형";
            } else if (first != second && first != third && second != third) {
                result = "부등변 삼각형";
            }
        }

        System.out.println(result + "입니다.");
    }
}
