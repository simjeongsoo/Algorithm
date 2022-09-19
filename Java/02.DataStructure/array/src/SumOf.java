// Q3
// 배열 a의 모든 요소의 합계를 구하여 반환하는 메서드 작성

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class SumOf {
    static int sumOf(int[] a) {
        int sum = 0;
        for (int data : a) {
            sum += data;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long seed = System.currentTimeMillis();
        Random rand = new Random(seed);

        System.out.print("요솟수는  : ");
        int num = stdIn.nextInt();

        int[] ary = new int[num]; // 배열 생성

        for (int i = 0; i < ary.length; i++) {
            ary[i] = 1 + rand.nextInt(100); // 배열에 1~100 난수 저장
        }

        System.out.println(Arrays.toString(ary)); // 현재 배열 요솟수 출력

        System.out.println("배열의 모든 요소의 합계 : " + sumOf(ary));
    }
}
