// Q13
// 입력한 수를 한 변으로 하는 정사각형 출력

import java.util.Scanner;

public class Square {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int n;

        System.out.println("정사각형을 출력합니다.");
        do {
            System.out.print("변의 길이 : ");
            n = stdIn.nextInt();
        } while (n <= 0);

        // 일반적인 별찍기
//        for (int i = 1; i <= n; i++) {
//            for (int j = 1; j <= n; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

        // repeat() 메소드 사용
        for (int i = 1; i <= n; i++) {
            System.out.println("*".repeat(n));
        }
    }
}
