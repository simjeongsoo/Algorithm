// 세 값의 최솟값을 구하여 출력

public class Min3Method {
    public static void main(String[] args) {
        System.out.println("min = " + min3(1,2,3));
        System.out.println("min = " + min3(3,2,1));
        System.out.println("min = " + min3(1,2,2));
        System.out.println("min = " + min3(1,3,2));
        System.out.println("min = " + min3(2,2,3));
    }

    static int min3(int a, int b, int c) {
        int min = a;

        if (b < min) min = b;
        if (c < min) min = c;

        return min;
    }
}
