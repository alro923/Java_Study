package com.tistory.uhhyunjoo.week01;

public class SwitchEx {
    public static void main(String[] args) {
        int rank = 1;
        char medalColor;

        // if 문
        if (rank == 1) {
            medalColor = 'G';
        } else if (rank == 2) {
            medalColor = 'S';
        } else {
            medalColor = 'B';
        }
        System.out.println(medalColor);

        rank = 2;

        // 기본 switch
        switch (rank) {
            case 1:
                medalColor = 'G';
                break;
            case 2:
                medalColor = 'S';
                break;
            default:
                medalColor = 'B';
                break; // default 문 뒤에는 break 해도 되고 안해도 되는듯
        }

        // 문자열이 case 값인 기본 switch
        String medal = "Bronze";
        switch (medal) {
            case "Gold":
                System.out.println("금메달");
                break;
            case "Silver":
                System.out.println("은메달");
                break;
            default:
                System.out.println("동메달");
                break;
        }
    }
}
