// 실습 1-13
// + 와 - 를 번갈아 출력(2)

import java.util.Scanner;

public class Alternative2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;
        System.out.println("+와 -를 번갈아 n개 출력합니다.");

        while (true) {
            System.out.print("n값 : ");
            n = stdIn.nextInt();
            if (n > 0) break;
            System.out.println("양의 정수를 입력해 주세요");
        }

        for (int i = 0; i < n / 2; i++) { // n/2번 반복
            System.out.println("+-");
        }
//        for (int i = 1; i <= n / 2; i++) // 카운터 변수 i 변경이 유용
//            System.out.println("+-");

        if (n % 2 != 0) { // if문 판단 한번
            System.out.println("+");
        }

    }
}
