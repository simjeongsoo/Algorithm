// 실습 2-6[A,B]
// 입력받은 10진수를 2진수~36진수로 기수 변환하여 출력

import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class CardConv {
    // 정수값 x를 r진수로 변환하여 배열 d에 아랫자리부터 넣어 두고 자릿수를 반환
    static int cardConv(int x, int r, char[] d) {
        int digits = 0;
        String dchar = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZ";

        do {
            d[digits++] = dchar.charAt(x % r); // r로 나눈 나머지 저장
            x /= r;
        } while (x != 0);

        for (int i = 0; i < digits / 2; i++) { // 배열 d의 숫자 문자열을 역순으로 정렬
            char t = d[i];
            d[i] = d[digits - i - 1];
            d[digits - i - 1] = t;
        }
        return digits;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int no;                     // 변환하는 정수
        int cd;                     // 기수
        int dno;                    // 변환 후의 자릿수
        int retry = 0;                  // 다시 한번?
        char[] cno = new char[32];  // 변환 후 각 자리의 숫자를 넣어두는 문자열

        System.out.println("10진수를 기수로 변환합니다.");
        do {
            do {
                System.out.print("변환하는 음이 아닌 정수 : ");
                no = stdIn.nextInt();
            } while (no < 0);
            do {
                System.out.print("어떤 진수로 변환할까요? (2~36) : ");
                cd = stdIn.nextInt();
            } while (cd < 2 || cd > 36);

            dno = cardConv(no, cd, cno); // no를 cd 진수로 변환

            System.out.println(cd + "진수로");
            for (int i = 0; i < dno; i++) {
                System.out.print(cno[i]);
            }
            System.out.println("입니다");

            System.out.print("retry? (1..y/0..no) : ");
            retry = stdIn.nextInt();
        } while (retry == 1);
    }
}
