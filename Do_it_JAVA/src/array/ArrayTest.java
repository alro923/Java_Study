package array;

public class ArrayTest {
    public static void main(String[] args) {

        // 배열 초기화
        int[] numbers = new int[]{0, 1, 2};
        System.out.println(numbers.length); // 초기화 되는 만큼, 메모리가 잡힌다.

        // enhanced
        for (int number : numbers) {
            System.out.println(number);
        }
    }
}
