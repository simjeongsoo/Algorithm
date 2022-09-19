// 실습 2-5
// 배열 요소에 값을 읽어들여 역순으로 정렬

import java.util.Arrays;
import java.util.Scanner;

public class ReverseArray {
    static void swap(int[] a, int idx1, int idx2) {
        //배열 요소 a[idx1] 과 a[idx2]의 값을 바꿈
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void reverse(int[] a) {
        // 배열 a의 요소를 역순으로 정렬
        for (int i = 0; i < a.length/2; i++) { // 배열의 길이/2 만큼 반복
            swap(a, i, a.length - i - 1); // 배열, 첫번째 요소, 마지막요소
        }
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();

        int[] x = new int[num]; // 요솟수가 num 인 배열

        for (int i = 0; i < x.length; i++) {
            System.out.print("x["+i+"] : ");
            x[i] = stdIn.nextInt();
        }

        reverse(x); // 배열 x의 요소를 역순으로 정렬

        System.out.println("요소를 역순으로 정렬했습니다.");
        System.out.println("x = " + Arrays.toString(x));


    }
}
