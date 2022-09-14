// 실습 1-9
// 양수만 입력하여 1,2,...,n 의 합을 구함

import java.util.Scanner;

public class SumFor2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("1부터 n까지의 합을 구합니다.");

        do {
            System.out.print("n값 : ");
            n = stdIn.nextInt();
        } while (n <= 0); // n이 0보다 클때까지 반복

        int sum = 0;

        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");
    }
}
