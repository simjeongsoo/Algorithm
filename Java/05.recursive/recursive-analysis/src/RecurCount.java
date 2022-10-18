// Q5
// 재귀 메서드 호출 횟수 카운트

import java.util.Scanner;

public class RecurCount {
    static int cnt;
    static void recur(int n) {
        cnt++;
        if (n > 0) {
            recur(n - 1);
            System.out.println(n);
            recur(n - 2);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        int x = stdIn.nextInt();
        recur(x);
        System.out.println("recur() call cnt = " + cnt);
    }
}
