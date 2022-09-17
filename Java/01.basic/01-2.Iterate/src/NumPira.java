// Q 16
// 숫자 피라미드 출력 프로그램

import java.util.Scanner;

public class NumPira {

    static void npira(int n) {
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n - i; j++) {
//                System.out.print(' ');
//            }
//            for (int j = 1; j <= (i - 1) * 2 + 1; j++) {
//                System.out.print(i%10); // i%10 을 하는 이유?
//            }
//            System.out.println();
//        }
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= (n - i); j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= (i - 1) * 2 + 1; k++) {
                System.out.print(i);
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

        npira(n);
    }
}

