// 실습 2-4
// 배열 요소의 최댓값을 출력(값을 난수로 생성)

import java.util.Scanner;
import java.util.Random; // Random 클래스 사용 선언

public class MaxOfArrayRand {
    static int maxOf(int[] a) {
        // 배열 a의 최댓값을 구하여 반환
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        Random random = new Random(); // Random 클래스형의 변수를 만들기 위한 선언

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");
        int num = stdIn.nextInt(); // 배열의 요솟수를 입력받음

        int[] height = new int[num]; // 요솟수가 num인 배열을 생성

        System.out.println("킷값은 아래와 같습니다.");
        for (int i = 0; i < num; i++) {

            //nextInt(n)가 반환하는 것은 0부터 n-1까지의 난수, random.nextInt(90) 은 0~89 까지의 난수 생성
            height[i] = 100 + random.nextInt(90); // 요솟값을 난수로 설정
            System.out.println("height[" + i + "] : " + height[i]);

        }

        System.out.println("최댓값은 "+maxOf(height)+"입니다.");
    }
}
