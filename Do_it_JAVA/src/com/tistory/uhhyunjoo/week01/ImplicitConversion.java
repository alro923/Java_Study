package com.tistory.uhhyunjoo.week01;

public class ImplicitConversion {
    public static void main(String[] args) {
        byte bNum = 10;
        int num = bNum; // 묵시적

        System.out.println(num);

        long lNum = 10;
        float fNum = lNum; // 묵시적

        System.out.println(fNum);

        double dNum = fNum + num; // 묵시적
        // 더해서 float 이 되고, 이게 double 로 형 변환됨
        System.out.println(dNum);
    }
}
