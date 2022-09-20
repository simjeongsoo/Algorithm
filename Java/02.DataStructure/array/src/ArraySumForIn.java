// 실습 2C-2 for each

public class ArraySumForIn {
    public static void main(String[] args) {
        double[] a = {1.0, 2.0, 3.0, 4.0, 5.0};
        double sum = 0;

        for (double data : a) {
            sum += data;
        }
        System.out.println("sum : " + sum);
    }
}
