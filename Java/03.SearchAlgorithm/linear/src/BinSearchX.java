// Q5
// 이진검색(일치하는 맨앞 요소를 찾습니다)

import java.util.Scanner;

public class BinSearchX {
    static int binSearchX(int[] a, int n, int key) {
        int pl = 0;
        int pr = n - 1;

        do {
            int pc = (pl + pr) / 2; // 중앙값

//            if (a[pc] == key) {
//                for ( ; pc > pl; pc--)	// key와 같은 맨앞의 요소를 검색합니다
//                    if (a[pc - 1] < key)
//                        break;
//                return pc;							// 검색 성공

                if (key == a[pc]){ // 키값을 찾으면
                for (int i = 1; i <= pc; i++) { // 반복 중앙값 인덱스 만큰 반복
                        if (key != a[pc - i]) { // 중앙값을 하나씩 앞쪽으로 스캔
                            return pc - i + 1; // key 값과 일치하지 않는 pc값 까지 탐색
                    }
                }
            }
            else if (a[pc] < key) {
                pl = pc + 1;
            } else pr = pc - 1;
        } while (pl <= pr);


        return -1;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요소값 : ");
        int n = stdIn.nextInt();
        int[] x = new int[n];

        System.out.println("오름차순 입력");
        x[0] = stdIn.nextInt();
        for (int i = 1; i < n; i++) {
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]);
        }

        System.out.print("key : ");
        int ky = stdIn.nextInt();

        int idx = binSearchX(x, n, ky);

        if (idx == -1) System.out.println("search fail");
        else System.out.println("result : " + idx);

    }
}
