// Q6
// Arrays.binarySearch로 이진검색(실패시 삽입 포인트를 출력)

import java.util.Scanner;
import java.util.Arrays;

public class BinarySearchTesterEx {
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

        int idx = Arrays.binarySearch(x, ky);

        if (idx < 0) {
            int insPoint = -idx - 1;
            System.out.println("그 값의 요소는 존재하지 않습니다.");
            System.out.printf("삽입 포인트는 %d입니다.\n", insPoint);
            System.out.printf("x[%d]의 바로 앞에 %d을(를) 삽입하면 배열의 정렬상태가 유지됩니다.", insPoint, ky);
        } else
            System.out.println("그 값은 x[" + idx + "]에 있습니다.");

    }
}
