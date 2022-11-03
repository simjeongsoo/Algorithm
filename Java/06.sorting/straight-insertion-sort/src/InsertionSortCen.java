// 단순삽입정렬(보초법 : 배열의 맨앞 요소는 비어 있음)
// 단순 삽입 정렬에서 배열의 맨 앞 요소인 a[0] 을 사용하지 않고 데이터를 a[1] 부터 저장하면
// a[0]을 보초로 하여 삽입을 마치는 조건을 줄일 수 있다.

import java.util.Scanner;

public class InsertionSortCen {

    //--단순삽입정렬(보초법 : 배열의 맨앞 요소는 비어 있음)--//
    static void insertionSortCen(int[] a, int n) {
        for (int i = 2; i < n; i++) {               // 아직 정렬되지 않은 부분 , i=1 은 보초
            int tmp = a[0] = a[i];
            int j = i;

            for (; a[j - 1] > tmp; j--) {
                a[j] = a[j - 1];
            }

            if (j > 0) a[j] = tmp;                  // 보초를 이용하여 loop의 조건을 줄임
        }
    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("단순삽입정렬");
        System.out.print("요솟수 : ");
        int nx = stdIn.nextInt();
        int[] x = new int[nx + 1];                  // x[0], 보초를 위한 배열 공간 확보

        for (int i = 1; i <= nx; i++) {				// x[1]~x[nx]에 입력 받음
            System.out.print("x[" + i + "] : ");
            x[i] = stdIn.nextInt();
        }

        insertionSortCen(x, nx + 1);

        System.out.println("오름차순으로 정렬하였습니다.");
        for (int i = 1; i <= nx; i++)
            System.out.println("x[" + i + "]＝" + x[i]);
    }
}
