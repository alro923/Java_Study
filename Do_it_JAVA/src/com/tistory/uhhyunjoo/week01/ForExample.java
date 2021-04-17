package com.tistory.uhhyunjoo.week01;

public class ForExample {
    public static void main(String[] args) {
        int num;
        int sum;
        int cnt;

        for (num = 1, sum = 0, cnt = 0; num <= 10; num++, cnt+=1){
            sum += num;
        }
        System.out.println(num);
        System.out.println(sum);
        System.out.println(cnt);
    }
}
