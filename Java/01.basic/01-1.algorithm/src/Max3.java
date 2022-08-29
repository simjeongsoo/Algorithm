// 3개의 정숫값을 입력하고 최댓값을 구하여 출력

import java.util.Scanner;

class Max3{
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("세 정수의 최댓값을 구합니다.");

        System.out.print("a의 값: ");
        int a = stdIn.nextInt(); // a값 입력
        System.out.print("b의 값: ");
        int b = stdIn.nextInt(); // b값 입력
        System.out.print("c의 값: ");
        int c = stdIn.nextInt(); // c값 입력

        int max = a; // max에 a 값을 넣음
        if (b > max) max = b; // b 값이 max 보다 크면 max에 b값을 넣음
        if (c > max) max = c; // c 값이 max 보다 크면 max에 c값을 넣음

        System.out.println("최댓값은 "+ max +" 입니다");

    }

}
