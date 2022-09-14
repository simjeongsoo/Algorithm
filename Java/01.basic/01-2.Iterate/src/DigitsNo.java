// Q10
// 양의 정수를 입력하고 자릿수를 출력하는 프로그램

import java.util.Scanner;

public class DigitsNo {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int numInt;

        while (true) {
            System.out.print("양의 정수 입력 : ");
            numInt= stdIn.nextInt();

            if (numInt > 0) break;
            System.out.println("양의 정수를 입력해 주세요");
        }

        int cnt = 0; // 자릿수를 저장하는 변수
        while (numInt != 0) { // 입력받은 정수가 0이 아니라면 반복
            numInt = numInt / 10; // 입력받은 정수를 10으로 나눌때마다
            cnt++; // 카운트
        }
        System.out.println("입력 받은 정수는 "+cnt+"자리 입니다.");
    }
}
