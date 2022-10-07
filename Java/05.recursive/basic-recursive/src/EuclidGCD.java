import java.util.Scanner;

public class EuclidGCD {

    static int gcd(int x, int y) {
        //--정수 x, y의 최대공약수를 구하여 반환--//
        if (y == 0) {
            return x;
        } else return gcd(y, x % y);
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
