// Q9
// 두 변수 a,b에 정수를 입력하고 b-a 를 출력하는 프로그램
// b 에 입력한 값이 a 이하면 b의 값을 다시 입력받음

import java.util.Scanner;

public class Difference {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        int a, b;

        System.out.print("a 값 : ");
        a = stdIn.nextInt();

        while (true) {
            System.out.print("b 값 : ");
            b = stdIn.nextInt();
            if (a >= b) {
                System.out.println("a 보다 큰 값을 입력하세요!");
            }else break;
        }

        System.out.println("b-a"+" 는 "+ (b-a) +" 입니다.");
    }
}
