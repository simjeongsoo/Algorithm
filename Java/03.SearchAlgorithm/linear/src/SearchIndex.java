// Q3
// 특정 값을 갖는 배열 안의 모든 요소를 다른 배열에 copy

import java.util.Scanner;

public class SearchIndex {

    static int searchIdx(int[] a, int n, int key, int[] idx) {
    //--- 배열 a의 앞쪽 n개의 요소에서 key와 일치하는 모든 요소의 인덱스를  ---//
    //--- 배열 idx의 앞쪽부터 순서대로 저장하고 일치하는 요솟수를 반환합니다 ---//
        //보초 검색
        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (a[i] == key) {
                idx[cnt++] = i; // idx 배열에 key값과 같은 요소인덱스를 저
            }
        }
        return cnt;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int n = stdIn.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < n; i++) {
            System.out.print("x["+i+"] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("찾을 값 : ");
        int key = stdIn.nextInt();
        int[] arrXIdx = new int[n];

        int cnt = searchIdx(x, n, key, arrXIdx);

        if (cnt == 0) System.out.println("찾는 요소 없음");
        else for (int i = 0; i < cnt; i++) {
            System.out.println("그 값은" +"x[" + arrXIdx[i] + "]에 있습니다.");
        }

    }
}
