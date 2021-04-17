package com.tistory.uhhyunjoo.week01;

public class IfEx {
    public static void main(String[] args) {
        int age = 24;
        int charge = 0;
        if (age < 8) {
            charge = 1000;
            System.out.println("미취학 아동");
        } else if (age <= 13) {
            charge = 2000;
            System.out.println("초등학생");

        } else if (age <= 19) {
            charge = 2500;
            System.out.println("중고등학생");
        } else {
            charge = 3000;
            System.out.println("성인");
        }
        System.out.println("입장료는 " + charge + "원 입니다.");
    }
}
