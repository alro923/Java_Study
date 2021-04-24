package array;

public class ArrayTest2 {
    public static void main(String[] args) {
        double[] num = new double[5];
        int size = 0;
        num[0] = 10.0;
        size++;
        num[1] = 20.0;
        size++;
        num[2] = 30.0;
        size++;

        double total = 1.0;
        for (int i = 0; i < size; i++) { // num.length 말고, size로 하면 유효한 부분만 반복한다.
            System.out.println(num[i]);
            total *= num[i];
        }
        System.out.println("total = " + total);
    }
}
