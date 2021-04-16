package com.tistory.uhhyunjoo.week01;

public class ExplicitConversion {
    public static void main(String[] args) {
        int iNum = 1000;
        byte bNum = (byte) iNum;

        System.out.println(iNum); // 1000
        System.out.println(bNum); // - 24

        // byte 는 1 byte 를 쓴다... -128 ~ 127 만 쓸 수 있음
        // 그래서 데이터의 손실이 일어난다~

        double dNum = 3.14;
        iNum = (int) dNum;

        System.out.println(dNum); // 3.14
        System.out.println(iNum); // 3
        // 소수점 아래 부분은 손실된다~ (truncate)

        float fNum = 0.9f;
        int num1 = (int)dNum + (int)fNum; // 3 + 0
        int num2 = (int)(dNum + fNum); // 4.04
        System.out.println(num1); // 3
        System.out.println(num2); // 4

    }
}
