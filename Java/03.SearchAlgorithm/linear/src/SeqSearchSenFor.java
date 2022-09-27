// Q1
// seqSearchSen -> for 문으로
import java.util.Scanner;

public class SeqSearchSenFor {

    static int seqSearchSenFor(int[] x, int n, int ky) {
        x[n] = ky;
        int i = 0;
//        for (i = 0; i < n; i++) {
//            if (x[i] == ky) break;
//        }
        for (i = 0; x[i] != ky ; ++i); // 배열 x가 ky와 같을때 까지 반복
        return i == n ? -1 : i;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("요솟수 : ");
        int n = stdIn.nextInt();
        int[] x = new int[n + 1];

        for (int i = 0; i < n; i++) {
            System.out.print("x["+i+"] : ");
            x[i] = stdIn.nextInt();
        }

        System.out.print("검색 할 값: ");
        int ky = stdIn.nextInt();

        int idx = seqSearchSenFor(x, n, ky);

        if (idx == -1) {
            System.out.println("값 없음");
        }else System.out.println("찾는 값은 : x["+idx+"]");
    }
}
