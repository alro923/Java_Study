package array;

public class TwoDimensionArray {
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(arr.length); // 행 개수
        System.out.println(arr[0].length); // 1 행의 길이 == 열 개수
        System.out.println(arr[1].length); // 2 행의 길이 == 열 개수

        System.out.println("--------");

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
        }
        System.out.println("--------");
        char[][] alphabets = new char[2][13];
        char ch = 'A';
        for (int i = 0; i < alphabets.length; i++) {
            for (int j = 0; j < alphabets[i].length; j++, ch++) {
                alphabets[i][j] = ch;
                System.out.println(alphabets[i][j]);
            }
        }
    }
}
