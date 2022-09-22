import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;

public class SeqSearchFor {
    static int seqSearch(int[] a, int n, int key) {
        // 요솟수가 n인 배열a 에서 key와 값이 같은 요소를 선형 검색 , 요소의 위치 리턴
        for (int i = 0; i < n; i++)
            if (a[i] == key) return i; // 검색 성공(인덱스 반환)
        return -1; // 검색 실패 (-1 반환)
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        long seed = System.currentTimeMillis();
        Random random = new Random(seed);


        System.out.print("요솟수 : ");
        int num = stdIn.nextInt();
        int[] x = new int[num];

        for (int i = 0; i < x.length; i++) {
            x[i] = 1 + random.nextInt(100);
        }
        System.out.println(Arrays.toString(x));

        System.out.print("검색할 값 :");
        int searchNum = stdIn.nextInt();
        int idx = seqSearch(x, num, searchNum); // 배열에서 찾는요소의 위치값 리턴

        if (idx == -1) {
            System.out.println("검색 실패");
        }else {
            System.out.println("그 값은 "+"x["+seqSearch(x, num, searchNum)+"] 에 위치합니다.");
        }
    }
}
