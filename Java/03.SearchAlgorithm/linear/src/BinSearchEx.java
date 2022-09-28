// Q4
// // 이진검색(검색 과정을 자세히 출력)

import java.util.Scanner;

public class BinSearchEx {
    static int binSearch(int[] a, int n, int key) {
    // 요솟수가 n개인 배열 a에서 key와 같은 요소를 이진 검색

        System.out.print("   |");
        for (int k = 0; k < n; k++) {
            System.out.printf("%4d", k);
        }
        System.out.println();

        System.out.print("---+");
        for (int k = 0; k < 4 * n + 2; k++) {
            System.out.print("-");
        }
        System.out.println();

        int pl = 0;
        int pr = n - 1;
        System.out.println("");

        do {
            int pc = (pl + pr) / 2; // 중앙 요소의 인덱스
            System.out.print("   |");
            if (pl != pc) {
                System.out.printf(String.format("%%%ds<-%%%ds+",(pl * 4) + 1, (pc - pl) * 4),"", "");
            }else System.out.printf(String.format("%%%ds<-+",   pc * 4 + 1), "");

            if (pc != pr) {
                System.out.printf(String.format("%%%ds->\n",(pr - pc) * 4 - 2), "");
            }else System.out.println("->");

            System.out.printf("%3d|", pc);

            for (int k = 0; k < n; k++)
                System.out.printf("%4d", a[k]);

            System.out.println("\n   |");

            if (key == a[pc])
                return pc; // search success
            else if (a[pc] < key) {
                pl = pc + 1;
            } else pr = pc - 1;
        } while (pl <= pr);
        return -1; // search fail
    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int n = stdIn.nextInt();
        int[] x = new int[n];

        System.out.println("오름차순으로 입력하세요");
        System.out.print("x[0] : ");		// 맨앞 요소를 입력받음
        x[0] = stdIn.nextInt();


        for (int i = 1; i < n; i++) {
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]);
        }

        System.out.print("검색 할 값 : ");
        int ky = stdIn.nextInt();

        int idx = binSearch(x, n, ky);

        if (idx == -1) System.out.println("search fail");
        else{
            System.out.println("idx == "+idx);
            System.out.println("result == "+x[idx]);
        }
    }
}
