package array;

public class ArrayTest3 {
    public static void main(String[] args) {
        // 문자 배열 (문자열 == string)
        char[] alphabets = new char[26];
        char ch = 'A';

        for(int i=0;i<alphabets.length;i++, ch++){
            alphabets[i] = ch;
            System.out.println(alphabets[i]);
        }
    }
}
