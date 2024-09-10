package com.study.sep9;

public class Application3 {

    public static void main(String[] args) {

        /* 정수 배열 {2,1,3,5,4}를 선언하고 {1,2,3,4,5}로 변경되게 하시오.*/

        int[] arr = {2, 1, 3, 5, 4};

        int temp = arr[0];
        arr[0] = arr[1];
        arr[1] = temp;
        int temp2 = arr[3];
        arr[3] = arr[4];
        arr[4] = temp2;

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
        }

    }
}
