package com.ex.sep6;

import java.util.Scanner;

public class methodLevel02 {

    public void methodLevel02a() {

        /* 문자열을 입력 받아서 문자열의 각 인덱스별로 한 글자씩 출력하세요
         *
         * 참고) 문자열의 길이는 String 클래스의 length() 메소드를 이용할 수 있습니다.
         *
         * -- 입력 예시 --
         * 문자열을 입력하세요 : apple
         *
         * -- 출력 예시 --
         * 0 : a
         * 1 : p
         * 2 : p
         * 3 : l
         * 4 : e
         * */

        Scanner sc = new Scanner(System.in);
        System.out.print("문자열을 입력하세요 : ");
        String str = sc.nextLine();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            System.out.println(i + " : " + ch);
        }
    }

    public void methodLevel02b() {

        /* 반복문을 이용하여 알파벳 소문자 'a'부터 'z'까지를 개행 없이 차례로 출력하세요
         *
         * -- 출력 예시 --
         * abcdefghijklmnopqrstuvwxyz
         * */

        int sum = 0;
        for (char ch = 97; ch <= 122; ch++) {
            System.out.print(ch);
        }
    }

        public void methodLevel02c () {

            /* 정수를 입력받아 1부터 입력받은 정수까지
             * 홀수이면 "수", 짝수이면"박"이 정수만큼 누적되어 출력되게 작성하시오.
             *
             * -- 입력 예시 --
             * 정수를 입력하세요 : 5
             *
             * -- 출력 예시 --
             * 수박수박수
             * */

            Scanner sc = new Scanner(System.in);
            System.out.print("정수를 입력하세요 : ");
            int num = sc.nextInt();


            int sum = 0;
            for (int i = 1; i <= num; i++) {
                if (i % 2 != 0) {
                    sum += i;
                    System.out.print("수");
                } else {
                    sum += i;
                    System.out.print("박");
                }
            }
        }
    }
