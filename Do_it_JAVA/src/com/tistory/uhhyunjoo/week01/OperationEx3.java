package com.tistory.uhhyunjoo.week01;

public class OperationEx3 {
    public static void main(String[] args) {
        int num1 = 10;
        System.out.println(num1 += 1);
        System.out.println(num1 %= 10);

        System.out.println(5 > 3 ? 50 : 30);
        System.out.println(5 < 3 ? "맞음" : "틀림");

        // 0101
        // 1010
        int a = 5;
        int b = 10;
        System.out.println(a & b); // 0000
        System.out.println(a | b); // 1111
        System.out.println(a << 1); // 1010 : 10
        System.out.println(b >> 1); // 0101 : 5
    }
}
