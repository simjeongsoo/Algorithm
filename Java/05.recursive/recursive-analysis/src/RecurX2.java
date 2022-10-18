// 실습 5-5
// 재귀를 제거

import java.util.Scanner;

public class RecurX2 {
    static void recur(int n) {
        //--재귀를 제거--//
        IntStack s = new IntStack(n);

        while (true) {
            if (n > 0) {
                s.push(n);      // n = 4    n = 3   n = 2   n = 1           /   n = 1   n = 2   n = 1
                n = n - 1;      // n = 3    n = 2   n = 1   n = 0 -> out    /   n = 0   n = 1   n = 0
                continue;
            }
            if (!s.isEmpty()) {         // 스택이 비어있지 않으면
                n = s.pop();            // n = 1    n = 2   n = 3   n = 1   n = 4   n = 1   n = 2
                System.out.println(n);  // n = 1    n = 2   n = 3   n = 1   n = 4   n = 1   n = 2
                n = n - 2;              // n = -1   n = 0   n = 1   n = -1  n = 2   n = -1  n = 0
                continue;
            }
            break;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = stdIn.nextInt();

        recur(x);
    }

}
