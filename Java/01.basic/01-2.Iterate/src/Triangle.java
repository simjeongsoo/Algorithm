// Q14
// 삼각형 별찍기

import java.util.Scanner;

public class Triangle {
    static void triangleLB(int n) { // 왼쪽 아래 직각
        System.out.println("======triangleLB======");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("======================");
    }

    static void triangleLU(int n) { // 왼쪽 위 직각
        System.out.println("======triangleLU======");
        for (int i = 1; i <= n; i++) {
            for (int j = i; j <= n; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println("======================");
    }
    static void triangleRU(int n) { // 오른쪽 위 직각
        System.out.println("======triangleRU======");
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i - 1; j++) {  // i - 1 개의 ' '을  출력
                System.out.print(' ');
            }
            for (int j = 1; j <= n - i + 1; j++) {  // n - i + 1 개의 '*'을  출력
                System.out.print('*');
            }
            System.out.println();
        }
        System.out.println("======================");

    }
    static void triangleRB(int n) { // 오른쪽 아래 직각
        System.out.println("======triangleRB======");
        for (int i = 1; i <= n; i++) {            // i 행( i = 1, 2, ... , n )
            for (int j = 1; j <= n - i; j++)         // n - i 개의 ' '을  출력
                System.out.print(' ');
            for (int j = 1; j <= i; j++)            // i 개의 '*'을  출력
                System.out.print('*');
            System.out.println();
        }
        System.out.println("======================");

    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;
        System.out.println("왼쪽 아래가 직각인 이등변삼각형을 출력합니다.");
        do { // 단수 입력
            System.out.print("몇 단 삼각형 입니까? : ");
            n = stdIn.nextInt();
        } while (n <= 0);

        triangleLB(n);
        triangleLU(n);
        triangleRU(n);
        triangleRB(n);
    }
}
