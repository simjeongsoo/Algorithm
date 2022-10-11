// recur2 메서드에 대한 상향식 분석

import java.util.Scanner;

public class Recur2 {

    /*
	상향식(Bottom Up) 분석, input : 4
	recur2(-1) (아무것도 출력하지 않음)
	recur2(0)  (아무것도 출력하지 않음)
	recur2(1)   recur2(-1) 1 recur2(0)    1
	recur2(2)   recur2(0) 2 recur2(1)     21
	recur2(3)   recur2(1) 3 recur2(2)     1321
	recur2(4)   recur2(2) 4 recur2(3)     2141321
*/

    static void recur2(int n) {
        if (n > 0) {
            recur2(n - 2);
            System.out.println(n);
            recur2(n - 1);
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력하세요 : ");
        int x = stdIn.nextInt();

        recur2(x);
    }
}
