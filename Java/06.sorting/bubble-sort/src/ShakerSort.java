// Q5
// 양방향 버블 정렬(셰이커 정렬)
// 홀수 번째 패스는 가장 작은 요소를 맨 앞으로 옮기고 짝수 번째 패스는 가장 큰 요소를 맨 뒤로 옮기는 방식을 사용(패스의 스캔 방향을 교대로 바꿈)
// [9,1,3,4,6,7,8]와 같은 배열을 더 적은 횟수로 비교 가능

import java.util.Scanner;

public class ShakerSort {
    //--- 배열의 요소 a[idx1]과 a[idx2]를 교환 ---//
    static void swap(int[] a, int idx1, int idx2) {
        int t = a[idx1];
        a[idx1] = a[idx2];
        a[idx2] = t;
    }

    //--- 양방향 버블 정렬(셰이커 정렬)---//
    static void shakerSort(int[] a, int n) {
        int left = 0;
        int right = n - 1;
        int last = right;력

        while (left < right){
            for (int j = right; j > left; j--){
                if (a[j - 1] > a[j]){
                    swap(a, j - 1, j);
                    last = j;
                }
            }
            left = last;

            for (int j = left; j < right; j++){
                if (a[j] > a[j + 1]){
                    swap(a, j, j + 1);
                    last = j;
                }
            }
            right = last;
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("양방향 버블 정렬(셰이커 정렬)");
        System.out.print("요솟수 : ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx];

        for (int i = 0; i < nx; i++) {
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        shakerSort(x, nx);				// 배열 x를 양방향 버블 정렬

        System.out.println("오름차순으로 정렬하였습니다.");
        for (int i = 0; i < nx; i++)
            System.out.println("x[" + i + "]＝" + x[i]);
    }
}
