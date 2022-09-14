// 실습 1-10
// 반복 과정에서 조건 판단하기 1
// 1,2,...,n의 합과 그 값을 구하는 과정을 출력(1)

import java.util.Scanner;

public class SumVerbose1 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값 : ");
        int n = stdIn.nextInt();

        int sum = 0;

//        for (int i = 1; i <= n; i++) {
//            sum += i;
//            if (i == n) { // i 가 n과 같다면 -> 마지막 숫자
//                System.out.print(i+ " = "+sum); // 마지막 숫자와 결과를 출력
//                break; // 루프 종료
//            }
//            System.out.print(i+" + "); // 그렇지 않다면 더하는 값 과 더하기 기호 출력
//        }

        for (int i = 1; i <= n; i++) {
            if (i < n)
                System.out.print(i + " + ");
            else
                System.out.print(i + " = ");
            sum += i;
        }
        System.out.println(sum);
    }
}