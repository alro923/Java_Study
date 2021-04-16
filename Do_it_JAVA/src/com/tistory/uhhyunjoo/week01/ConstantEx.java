package com.tistory.uhhyunjoo.week01;

public class ConstantEx {
    public static void main(String[] args) {
        final int MAX_NUM = 100;
        final double PI = 3.14;

        // PI = 3.15; // Cannot assign a value

        final int STUDENT_NUM = 30;
        int num = 10;

        if (num == STUDENT_NUM){
            System.out.println(STUDENT_NUM);
        }
    }
}
