// 실습 1C-2
// 2자리의 양수(10~99)를 입력
// 드모르간 법칙 

import java.util.Scanner;

public class TwoDigits {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;

        System.out.println("2자리의 양수를 입력하세요.");

        do {
            System.out.print("no값 :");
            no = stdIn.nextInt();
        } while (no < 10 || no > 99); // no 는 2자리가 아님 , 계속조건
        // !(no >= 10 && no <= 99) // no는 2자리 , 종료조건
        System.out.println("변수 no값은 " + no + "이 되었습니다.");
    }
}
