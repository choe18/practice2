package com.study.sep09;

public class Application2 {

    public static void main(String[] args) {

        //길이가 10인 배열을 선언하고  1부터 10까값을 반복문을 이용하여
        //역순으로 배열 인덱스에 넣은 후 출력
        //출력결과) 10 9 8 7 6 5 4 3 2 1

        int[] arr;
        arr = new int[10];

        for(int i = 10; i >= 1; i--) {
            System.out.print(i + " ");
        }
    }
}
