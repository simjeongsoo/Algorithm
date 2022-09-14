// Q7
// 1~10의 합은 (1+10)*5 와 같이 구할 수 있습니다.
// 이를 '가우스의 덧셈' 이라고 하는데 이 방법을 이용하여 1부터 n 까지의 정수 합을 구하는 프로그램 작성

import java.util.Scanner;

public class SumGauss {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("가우스의 덧셈");
        System.out.println("1부터 n까지 정수의 합을 구함");
        System.out.print("n 값 : ");
        int n = stdIn.nextInt();
        int sum = 0;

        sum = (1 + n) * (n / 2); // n이 홀수일 경우 n의 중간값이 더해지지 않음
        if (n % 2 != 0) { // n이 2로 나눠지지 않는다면
            sum += (n + 1) / 2; // n의 중간값을 구해 더하는 식 추가
        }

//        sum = (n + 1) * (n / 2) + (n % 2 == 1 ? (n + 1) / 2 : 0);   // 3항 연산자 사용 식

        System.out.println("1부터 " + n + "까지의 합은 " + sum + "입니다.");


    }
}
