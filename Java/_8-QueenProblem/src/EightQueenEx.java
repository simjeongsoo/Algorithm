// Q9
// ８퀸 문제 풀이(배치 상황을 □와 ■으로 출력)

public class EightQueenEx {

    static boolean[] flag_a = new boolean[8];               // 각 행에 퀸을 배치했는지 체크
    static boolean[] flag_b = new boolean[15];              // '/' 대각선 방향으로 퀸을 배치했는지 체크
    static boolean[] flag_c = new boolean[15];              // '\' 대각선 방향으로 퀸을 배치했는지 체크
    static int[] pos = new int[8];                          // 각 열에 있는 퀸의 위치
    static int cnt = 0;                                     // 출력 횟수 count 변수

    static void print() {
        //--배치 상황(각열의 퀸의 위치)을 출력--//
        ++cnt;
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++)
                System.out.printf("%s", j == pos[i] ? "■" : "□");
            System.out.println();
        }
        System.out.println();
    }

    static void set(int i) {
        //--i 열에 알맞은 위치에 퀸을 배치--//
        for (int j = 0; j < 8; j++) {
            if (!flag_a[j] &&                   // 가로(j행)에 아직 배치하지 않음
                    !flag_b[i + j] &&           // '/' 대각선에 아직 배치하지 않음
                    !flag_c[i - j + 7]) {       // '\' 대각선에 아직 배치하지 않음
                pos[i] = j;                     // 퀸을 j행에 배치
                if (i == 7) {                   // 모든 열에 배치
                    print();
                } else {
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = true;
                    set(i + 1);
                    flag_a[j] = flag_b[i + j] = flag_c[i - j + 7] = false;
                }
            }
        }

    }

    public static void main(String[] args) {
        set(0);
        System.out.println(cnt);
    }
}
