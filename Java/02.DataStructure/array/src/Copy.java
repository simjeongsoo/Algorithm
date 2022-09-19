// Q4
// 배열 b의 모든 요소를 배열 a에 복사하는 메서드 copy를 작성

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Copy {
    static void copy(int[] a, int[] b) {
        int len = a.length >= b.length ? b.length : a.length; // 삼항연산자를 이용하여 복사 길이 판별 
        for (int i = 0; i < len; i++) {
            a[i] = b[i];
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long seed = System.currentTimeMillis();
        Random rand = new Random(seed);

        System.out.print("a 요솟수는  : ");
        int numA = stdIn.nextInt();
        int[] a = new int[numA]; // a배열 생성
        System.out.print("b 요솟수는  : ");
        int numB = stdIn.nextInt();
        int[] b = new int[numB]; // b배열 생성

        for (int i = 0; i < a.length; i++) {
            a[i] = 1 + rand.nextInt(100); // a배열에 1~100 난수 저장
        }
        for (int i = 0; i < b.length; i++) {
            b[i] = 1 + rand.nextInt(100); // b배열에 1~100 난수 저장
        }

        System.out.println("a[] = "+Arrays.toString(a)); // a배열 요솟수 출력
        System.out.println("b[] = "+Arrays.toString(b)); // b배열 요솟수 출력

        copy(a, b);
        System.out.println("run copy...");

        System.out.println("a[] = "+Arrays.toString(a)); // a배열 요솟수 출력
        System.out.println("b[] = "+Arrays.toString(b)); // b배열 요솟수 출력
    }
}
