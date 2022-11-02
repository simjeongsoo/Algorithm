// 단순 삽입 정렬

import java.util.Scanner;

public class InsertionSort {

    //--단순 삽입 정렬--//
    static void insertionSort(int[] a, int n) {

        for (int i = 1; i < n; i++) {                       // 아직 정렬되지 않은 부분
            int j = i;                                      // 삽입할 요소 인덱스
            int tmp = a[j];                                 // 삽입할 요소 값

            // 정렬된 부분과 비교
            // 조건식
            // 1.정렬된 열의 끝에 도달
            // 2.tmp보다 작거나 같은 key를 갖는 항목 a[j-1]을 발견
            for (j = i; j > 0 && a[j - 1] > tmp; j--) {
                a[j] = a[j - 1];                            // swap
            }
            a[j] = tmp;
        }

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("단순 삽입 정렬");
        System.out.print("요솟수 : ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x["+i+"] : ");
            x[i] = stdIn.nextInt();
        }

        insertionSort(x, nx);

        System.out.println("오름차순으로 정렬했습니다.");
        for (int value : x) {
            System.out.println(value);

        }
    }
}
