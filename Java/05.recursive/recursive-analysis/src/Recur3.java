// Q6
// recur3의 메서드를 비재귀적으로 구현
public class Recur3 {
    static void recur3(int n) {
        if (n > 0) {
            recur3(n - 1);
            recur3(n - 2);
            System.out.println(n);
        }
    }

    //--- 메서드 recur의 비재귀적 구현 ---//
    static void noRecur(int n) {
        int[] nstk = new int[100];
        int[] sstk = new int[100];
        int ptr = -1;
        int sw = 0;

        while (true) {
            if (n > 0) {
                ptr++;
                nstk[ptr] = n;
                sstk[ptr] = sw;

                if (sw == 0)
                    n = n - 1;
                else if (sw == 1) {
                    n = n - 2;
                    sw = 0;
                }
                continue;
            }
            do {
                n  = nstk[ptr];
                sw = sstk[ptr--] + 1;

                if (sw == 2) {
                    System.out.println(n);
                    if (ptr < 0)
                        return;
                }
            } while (sw == 2);
        }
    }

    public static void main(String[] args) {
//        recur3(3);
        noRecur(3);
    }
}
