// 실습 1-12
// + 와 - 를 번갈아 출력(1)

import java.util.Scanner;

public class Alternative1 {
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

        for (int i = 0; i < n; i++) { // for 문 n번 반복
            if (i % 2 == 0) { // 짝수 , if문 판단 n번 반복
                System.out.print("+");
            }else System.out.print("-"); // 홀수
        }
    }
}
