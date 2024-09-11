package com.study.sep11.level02.normal.student.run;

import com.study.sep11.level02.normal.student.model.dto.StudentDTO;

import java.util.Scanner;

public class Application {

    public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);
            System.out.print("학년 : ");
            int grade = sc.nextInt();
            System.out.print("반 : ");
            int classroom = sc.nextInt();
            System.out.print("이름 : ");
            String name = sc.next();
            System.out.print("키 : ");
            double height = sc.nextDouble();
            System.out.print("성별 : ");
            char gender = sc.next().charAt(0);

            StudentDTO studentDTO = new StudentDTO(grade, classroom, name, height, gender);
            studentDTO.printInformation();
        }
    }

