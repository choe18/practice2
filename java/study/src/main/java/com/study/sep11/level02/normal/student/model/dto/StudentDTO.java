package com.study.sep11.level02.normal.student.model.dto;

public class StudentDTO {
    private int grade;
    private int classroom;
    private String name;
    private double height;
    private char gender;

    // 기본 생성자
    public StudentDTO() {}

    // 모든 필드를 초기화 하는 생성자 작성
    public StudentDTO(int grade, int classroom, String name, double height, char gender) {
        this.grade = grade;
        this.classroom = classroom;
        this.name = name;
        this.height = height;
        this.gender = gender;
    }



    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setClassroom(int classroom) {
        this.classroom = classroom;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }




    public int getGrade() {
        return grade;
    }

    public int getClassroom() {
        return classroom;
    }

    public String getName() {
        return name;
    }

    public double getHeight() {
        return height;
    }

    public char getGender() {
        return gender;
    }



    public void printInformation() {


        System.out.println("학년 : " + grade);
        System.out.println("반 : "  + classroom);
        System.out.println("이름 : " + name);
        System.out.println("키 : " + height);
        System.out.println("성별 : " + gender);

    }
}
