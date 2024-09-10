package com.study.sep05;

import java.util.Scanner;

public class Application3 {

    public static void main(String[] args) {
        /*
        사용자가 입력한 날짜 ( month, day)에 따라 다음을 판별하고 출력하세요
        1. 계절 판별
        봄 : 3월~5월
        여름 : 6월~8월
        가을 : 9월~11월
        겨울 : 12월~2월
        2. 특정 기념일 판별
        크리스마스 : 12월 25일
        할로윈 : 10월 31일
        제헌절 : 7월 17일
        3. 입력된 날짜가 유효하지 않을 때 "잘못된 날짜입니다" 출력
        예) month가 1~12사이가 아닐때, day가 1~31일 아닐때
         */

        Application3 app3 = new Application3();
        app3.date();
    }

    public void date() {
        System.out.print("month를 입력하세요 : ");
        Scanner sc = new Scanner(System.in);
        int month = sc.nextInt();

        System.out.print("day를 입력하세요 : ");
        Scanner sc1 = new Scanner(System.in);
        int day = sc1.nextInt();

        if (month >= 1 && month <= 12 && day >= 1 && day <= 31) {
            if (month ==12 && day == 25) {
                System.out.println("크리스마스");
                return;
            }
            if (month == 7 && day == 17) {
                System.out.println("제헌절");
                return;
            }
            if (month == 10 && day == 31) {
                System.out.println("할로윈");
                return;
            }
            if (month >= 3 && month <= 5) {
                System.out.println("봄");
                return;
            }
            if (month >= 6 && month <= 8) {
                System.out.println("여름");
                return;
            }
            if (month >= 9 && month <= 11) {
                System.out.println("가을");
                return;
            }
            if (month >= 2 && month <= 12) {
                System.out.println("겨울");
                return;
            }
        } else {
            System.out.println("잘못된 날짜입니다.");
        }
    }
}
