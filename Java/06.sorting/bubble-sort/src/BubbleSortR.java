// Q1
// Bubble Sort 의 각 패스에서 비교,교환을 배열의 앞쪽, 즉 처음부터 수행하는 프로그램
// 각 패스에서 가장 큰 값의 요소가 맨 끝으로 옮겨진다.

import java.util.Scanner;

public class BubbleSortR {

    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    static void bubbleSort(int[] a, int n) {
        //--단순 교환 정렬--//

        // 정렬된 요소 인덱스 체크용
        for (int i = n - 1; i > 0; i--) {
            // 패스
            for (int j = 0; j < i; j++) {
                if (a[j] > a[j + 1]) {
                    // 배열 앞부터 버블정렬
                    swap(a, j, j + 1);
                }
            }
        }
    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("버블정렬(버전1)");
        System.out.print("요솟수 : ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x["+i+"] : ");
            x[i] = stdIn.nextInt();
        }

        bubbleSort(x, nx);  // 배열 x를 버블 정렬

        System.out.println("오름차순으로 정렬했습니다.");
        for (int i = 0; i < nx; i++) {
            System.out.println("x[" + i + "] = " + x[i]);
        }
    }
}
