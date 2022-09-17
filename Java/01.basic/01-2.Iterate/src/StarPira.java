// Q 15
// 피라미드 출력 프로그램

import java.util.Scanner;

public class StarPira {
    static void spira(int n) {
//        for (int i = 1; i <= n; i++) {                  // i 행( i = 1, 2, ... , n )
//
//            for (int j = 1; j <= n - i; j++)			// n - i 개의 ' ' 을 출력
//                System.out.print(' ');
//
//            for (int j = 1; j <= (i-1)*2+1; j++)	    // (i - 1) * 2 + 1 개의 '*' 을 출력
//                System.out.print('*');
//
//            System.out.println();						// 줄바꿈
//        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i - 1) * 2 + 1; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;
        System.out.println("피라미드 만들기");
        do { // 단수 입력
            System.out.print("몇 단 피라미드 입니까? : ");
            n = stdIn.nextInt();
        } while (n <= 0);

        spira(n);
    }
}
