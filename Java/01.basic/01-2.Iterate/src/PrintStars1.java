// 실습 1-14
// * 을 n개 출력하되 w 개 마다 줄바꿈(1)

import java.util.Scanner;

public class PrintStars1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n, w;

        System.out.println("* 을 n개 출력하되 w 개 마다 줄을 바꿔서 출력");
        do {
            System.out.print("n값 : ");
            n = stdIn.nextInt();
        } while (n <= 0); // n이 음수이면 반복

        do {
            System.out.print("w값 : ");
            w = stdIn.nextInt();
        } while (w <= 0 || w > n); // w가 음수 or w가 n 보다 크면 반복

//        int cnt = 0;
//        for (int i = 0; i < n; i++) { // n번 반복
//            System.out.print("*");
//            cnt++;
//            if (cnt % w == 0) {
//                System.out.println();
//            }
//        }

        for (int i = 0; i < n; i++) {
            System.out.print("*");
            if (i % w == w - 1) {
                System.out.println();
            }
        }
        if (n % w != 0) {
            System.out.println();
        }
    }
}
