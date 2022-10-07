import java.util.Scanner;

public class EuclidGCDEx {

    static int gcd(int x, int y) {
        while (y != 0) {
            int temp = y;
            y = x % y;
            x = temp;
        }
        return x;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("두 정수의 최대 공약수를 구합니다.");

        System.out.print("x 입력 : ");
        int x = stdIn.nextInt();
        System.out.print("y 입력 : ");
        int y = stdIn.nextInt();

        System.out.println("최대 공약수는 "+gcd(x,y)+"입니다.");
    }
}
