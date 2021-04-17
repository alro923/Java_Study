package com.tistory.uhhyunjoo.week01;

public class ContinueEx {
    public static void main(String[] args) {
        int num;
        for (num = 1; num <= 10; num++) {
            if (num % 2 == 0)
                continue; // num 값이 짝수인 경우 이후 수행을 생략하고 num++ 수행
            System.out.println(num); // 즉, 이건 num 이 홀수인 경우에만 수행
        }
    }
}
