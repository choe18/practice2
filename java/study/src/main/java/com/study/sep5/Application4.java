package com.study.sep5;

import java.util.Scanner;

public class Application4 {

    public static void main(String[] args) {

        Application4 app4 = new Application4();
        app4.test();

    }

    public void test() {
        System.out.println("휴일을 맞아 자연으로 여행을 떠났습니다.");
        System.out.println("넓은 잔디 밭 나무 아래서 낮잠을 자는데");
        System.out.println("옆에서 소리가 들려 일어나보니...");
        System.out.println("당신의 옆에 있던 동물은? (1. 펭귄, 2. 강아지, 3. 호랑이, 4. 토끼, 5. 팬더, 6. 사슴)");
        System.out.print(" : ");

        Scanner sc = new Scanner(System.in);
        int choice = sc.nextInt();

        if (choice == 1) {
            System.out.println("게으른 자기 자신에게 화난 상태. 뭐가 되었건 중요한 일도 뒤로 미루는 버릇이 있어, 주위 사람과 당신 모두 많이 지친것 같네요.");
        } else if (choice == 2) {
            System.out.println("새로운 자극 없는 지루한 일상에 질린 상태. 좋아하는 걸 찾는 과정은 생각을 줄이고 바로 움직여 보세요!");
        } else if (choice == 3) {
            System.out.println("하고 있는 일과 성과가 큰 스트레스. 충분히 잘 진행되고 있으니 큰 부담감을 줄이는게 중요해요!");
        } else if (choice == 4) {
            System.out.println("스트레스 주원인은 인간관계, 겉과 속이 다른 사람들의 태도에 가장 큰 스트레스를 받고 있어요.");
        } else if (choice == 5) {
            System.out.println("해야할 일은 많은데 의욕이 없어 스트레스를 받아요. 쉴 땐 쉬고 할 땐 제대로 하자는 마음가짐이 중요해요!");
        } else if (choice == 6) {
            System.out.println("자존심이 센 편이라 비교 당하거나 지적을 당하면 큰 스트레스를 받아요. 너무 마음에 담아두지 않는게 좋아요!");
        }

        System.out.println("재미있는 심리테스트 끝!");
    }
}
