import java.util.Scanner;

public class RecurX1 {
    static void recur(int n) {
        // 꼬리 재귀의 제거
        while (n > 0) { // if -> while로 변경
            recur(n - 1);
            System.out.print(n);
            n = n - 2;      // n 값을 2만큼 감소 시킨 후 메서드의 시작 지점으로 돌아감
        }
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = stdIn.nextInt();

        recur(x);

    }
}
