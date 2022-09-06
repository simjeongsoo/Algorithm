// 실습 1C-1 세값의 중앙값

import java.util.Scanner;

class Median {
    static int med3(int a, int b, int c) {
        if (a >= b) // a 가 b 보다 크거나 같고
            if (b >= c) // b 가 c 보다 크거나 같으면
                return b; // a >= 'b' >= c

            else if (a <= c) // a 가 c 보다 작거나 같으면
                return a; // c >= 'a' >= b

            else
                return c; // b 가 c 보다 크거나 같지않고 a 가 c 보다 작거나 같지않으면 b <= 'c' <= a
                          // b 가 c 보다 작고 a 가 c 보다 크면  a >= 'c' >= b

        else if (a > c) // a 가 b 보다 작고, a 가 c 보다 크면
            return a; // c < 'a' < b

        else if (b > c) // a 가 b 보다 작고, a 가 c 보다 작고, b 가 c 보다 크면
            return c;  // a < 'c' < b

        else // a 가 b 보다 작고, a 가 c 보다 작고, b 가 c 보다 작으면
            return b; // a < 'b' < c
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 중앙값을 구합니다.");
        System.out.print("a의 값 : ");
        int a = stdIn.nextInt();
        System.out.print("b의 값 : ");
        int b = stdIn.nextInt();
        System.out.print("c의 값 : ");
        int c = stdIn.nextInt();

        System.out.println("중앙값은 "+ med3(a,b,c) +" 입니다.");

    }
}
