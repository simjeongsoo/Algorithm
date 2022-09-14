// 실습 1-11
// 1,2,...,n의 합과 그 값을 구하는 과정을 출력(1)

import java.util.Scanner;

public class SumVerbose2 {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n까지의 합을 구합니다.");
        System.out.print("n값 : ");
        int n = stdIn.nextInt();

        int sum = 0;

        // 반복문과 판단식 분리
        // for 문은 반복을 n-1번 하고, if 문에 의한 판단은 없음
        for (int i = 1; i < n; i++) { // 1~n-1 까지 , (i +)  출력
            System.out.print(i+" + ");
            sum += i; // sum 에 i를 더함
        }
        System.out.print(n + " = ");
        sum += n; // sum 에 n를 더함
        System.out.println(sum);
    }
}
