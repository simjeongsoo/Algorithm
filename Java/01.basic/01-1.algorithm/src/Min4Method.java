// 네 값의 최솟값을 구하여 출력

public class Min4Method {
    public static void main(String[] args) {
        System.out.println("min = " + min3(1,2,3,4));
        System.out.println("min = " + min3(3,2,1,4));
        System.out.println("min = " + min3(1,2,2,4));
        System.out.println("min = " + min3(1,3,2,4));
        System.out.println("min = " + min3(2,2,3,4));
    }

    static int min3(int a, int b, int c,int d) {
        int min = a;

        if (b < min) min = b;
        if (c < min) min = c;
        if (d < min) min = d;

        return min;
    }
}
