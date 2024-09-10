package com.study.sep9;

public class Application1 {

    public static void main(String[] args) {

        // 배열을 이용하여
        // 배열 인덱스 범위의 난수를 발생시켜 랜덤한 과일과 가격을 뽑고
        // 인덱스를 이용해서 출력하는 함수를 작성하세요
        // ex) 당신이 선택한 과일인 바나나의 가격은 2000원 입니다.

        String[] fruit = {"사과", "바나나", "수박", "포도", "키위"};
        int [] price = {1000, 2000, 3000, 4000, 5000};

        int randomAlphabetIndex = (int) (Math.random() * fruit.length);
        int randomNumIndex = (int) (Math.random() * price.length);

        System.out.println("당신이 선택한 과일인 " + fruit[randomAlphabetIndex] + "의 가격은 " + price[randomNumIndex] + "원 입니다.");


    }
}
