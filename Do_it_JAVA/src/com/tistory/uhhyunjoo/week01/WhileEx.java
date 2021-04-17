package com.tistory.uhhyunjoo.week01;

public class WhileEx {
    public static void main(String[] args) {
        int num = 1;
        int sum = 0;

        // while 문
        while (num < 1) {
            sum += num;
            num++;
        }
        System.out.println(sum);

        // do while 문
        sum = 0;
        num = 1;
        do {
            sum += num;
            num++;
        } while (num < 1);
        System.out.println(sum);

    }
}

