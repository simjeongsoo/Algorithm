// 실습 3-4
// 이진 검색

import java.util.Scanner;

public class BinSearch {
    static int binSearch(int[] a, int n, int key) {
        // 요솟수가 n개인 배열 a에서 key와 같은 요소를 이진 검색
        int pl = 0; // start idx
        int pr = n - 1; // end idx

        do {
            int pc = (pl + pr) / 2; // center idx

            if (a[pc] == key) {
                return pc; // search success
            } else if (a[pc] < key) {
                pl = pc + 1; // start idx = center + 1
            } else
                pr = pc - 1; // end idx = center - 1
        } while (pl <= pr);

        return -1; // search fail
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        System.out.println("오름차순으로 입력하세요");

        System.out.print("x[0] : "); // 첫 요소 입력받음
        x[0] = stdIn.nextInt();

        for (int i = 1; i < num; i++) {
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]); // 오름차순을 위함, 앞의 요소보다 작으면 다시 입력받음
        }

        System.out.print("검색할 값 : ");
        int ky = stdIn.nextInt();

        int idx = binSearch(x, num, ky);

        if (idx == -1) {
            System.out.println("그 값의 요소가 없습니다.");
        }else
            System.out.println("그 값은 x["+idx+"]에 있습니다.");


    }
}
