package com.study.sep11.level01.basic.member.run;

import com.study.sep11.level01.basic.member.model.MemberDTO;

public class Application {

    public static void main(String[] args) {

            MemberDTO member = new MemberDTO();
            System.out.println(member.getInfermation());

            MemberDTO member2 = new MemberDTO("user01", "pass01", "홍길동", 20, 'M', "010-1234-5678", "hong123@greedy.com");
            System.out.println(member2.getInfermation());
        }

    }

