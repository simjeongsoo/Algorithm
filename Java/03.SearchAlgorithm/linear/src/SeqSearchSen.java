// 실습 3-3
// 선형검색 (보초법)

import java.util.Scanner;

public class SeqSearchSen {
    //--요솟수가 n인 배열a에서 key와 값이 같은 요소를 보초법으로 선형 검색
    static int seqSearchSen(int[] a, int n, int key) {
        a[n] = key; // sentinel
        int result = 0;

        for (int i = 0; i < a.length; i++) {
            if (a[i] == key) {
                result = i;
                break;
            }
        }
        return result;
    }

    static int seqSearchSenWhile(int[] a, int n, int key) {
        int i = 0;
        a[n] = key; //sentinel
        while (true) {
            if (a[i] == key) break;
            i++;
        }
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int n = stdIn.nextInt();
        int[] x = new int[n+1];

        for (int i = 0; i < n; i++) {
            System.out.print("x[" + i + "]: ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색할 값 : ");
        int key = stdIn.nextInt();

//        int idx = seqSearchSen(x, n, key);
        int idx = seqSearchSenWhile(x, n, key);

//        if (idx == n) {
//            System.out.println("그 값은 없습니다.");
//        }else System.out.println("그 값은 x["+idx+"]에 있습니다.");
        if (idx == -1) {
            System.out.println("그 값은 없습니다.");
        }else System.out.println("그 값은 x["+idx+"]에 있습니다.");
    }
}
