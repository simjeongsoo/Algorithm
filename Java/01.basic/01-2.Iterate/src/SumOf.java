// Q8
// 정수 a,b를 포함하여 그 사이의 모든 정수의 합을 구하여 반환하는 메서드

import java.util.Scanner;

public class SumOf {
    static int sumOf(int a, int b) {
        // a,b의 대소관계 고려x
        int sum = 0;
        int start = 0, end = 0;

        if (a > b) { // a가 b보다 큰 경우
            start = b;
            end = a;
            for (int i = start; i <= end; i++) {
                sum += i;
            }
            return sum;
        }
        else { // b가 a 보다 큰 경우
            start = a;
            end = b;
            for (int i = start; i <= end; i++) {
                sum += i;
            }
        }
     return sum;
    }

    static int sumOf2(int a, int b) {
        int min, max;
        if (a > b) { // a가 b보다 큰 경우
            max = a; min = b;
        }else {      // b가 a 보다 큰 경우
            max = b; min = a;
        }

        int sum = 0;
        for (int i = min; i <= max; i++) {
            sum += i;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("a : ");
        int a = stdIn.nextInt();
        System.out.print("b : ");
        int b = stdIn.nextInt();

//        System.out.println("정수 " + a + "," + b + " 를 포함하여 그 사이의 모든 정수의 합 : " + sumOf(a, b));
        System.out.println("정수 " + a + "," + b + " 를 포함하여 그 사이의 모든 정수의 합 : " + sumOf2(a, b));
    }
}
