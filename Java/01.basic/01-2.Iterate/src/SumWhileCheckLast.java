// Q6
// 실습 1-7에서 while 문이 종료될 때 변수 i 값이 n+1이 되는지 확인
// 변수 i 값을 출력하도록 프로그램 수정

import java.util.Scanner;

public class SumWhileCheckLast {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n 까지의 합을 구합니다");
        System.out.print("n값 : ");
        int n = stdIn.nextInt();

        int sum = 0; // 합
        int i = 1;

        while (i <= n) { // i가 n 이하면 반복함
            sum += i;    // sum 값에 i를 더함
            i++;         // i 값을 1만큼 증가
            System.out.println("i : "+i); // loop 마다 i 값을 출력 
        }

        System.out.println("1부터 " + n +"까지의 합은 "+sum+"입니다.");

    }
}
