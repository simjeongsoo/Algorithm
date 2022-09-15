// 실습 1-5
// * 을 n개 출력하되 w 개 마다 줄바꿈(2)

import java.util.Scanner;

public class PrintStars2 {
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

        for (int i = 0; i < n / w; i++) { // 반복 n/w번 실행
            System.out.println("*".repeat(w));
        }
        int rest = n % w;
        if (rest != 0) { // 판단 1번 실행
            System.out.println("*".repeat(rest));
        }

    }
}

