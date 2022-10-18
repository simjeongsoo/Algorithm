// 재귀 함수를 메모화로 구현

import java.util.Scanner;

public class RecurMemo {
    static String[] memo;                                           // 메모하는 것은 출력할 문자열, 따라서 메모를 저장하는 곳은 String형 배열

    static void recur(int n) {
        //--메모화를 도입한 recur 메서드--//
            if (memo[n + 1] != null) {
                System.out.print(memo[n + 1]);                      // 메모를 출력   [1]
        } else {
            if (n > 0) {
                recur(n - 1);
                System.out.println(n);                              // [2]
                recur(n - 2);
                memo[n + 1] = memo[n] + n + "\n" + memo[n - 1];     // 메모화  [3]
            } else {
                memo[n + 1] = "";                                   // 메모화: recur(0)과 recur(-1)은 빈 문자열  [4]
            }
        }
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("정수를 입력하세요 : ");
        int x = stdIn.nextInt();

        memo = new String[x + 2];
        recur(x);

    }
}
