// 실습 3-5
// Arrays.binarySearch 로 이진 검색

import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchTester {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("요솟수 : ");
        int n = stdIn.nextInt();
        int[] x = new int[n]; // 요솟수가 n인 배열

        System.out.println("오름차순으로 입력하세요");

        System.out.print("x[0] : "); // 배열의 첫 요소를 먼저 입력받음
        x[0] = stdIn.nextInt();

        for (int i = 1; i < n; i++) {
            do {
                System.out.print("x[" + i + "] : ");
                x[i] = stdIn.nextInt();
            } while (x[i] < x[i - 1]); // 오름차순을 위함, 앞의 요소보다 작으면 다시 입력받음
        }

        System.out.print("검색할 값: ");
        int ky = stdIn.nextInt();

        int idx = Arrays.binarySearch(x, ky); // 배열 x에서 값이 ky인 요소 검색

        if (idx < 0) {
            System.out.println("그 값의 요소가 없습니다.");
        }else System.out.println("그 값은 x["+idx+"]에 있습니다.");
    }
}
