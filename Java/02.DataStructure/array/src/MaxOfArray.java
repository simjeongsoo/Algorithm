// 실습 2-3
// 프로그램 실행 중 배열의 요솟수 결정하기
// 배열 요소의 최댓값 출력(값을 입력받음)

import java.util.Scanner;

public class MaxOfArray {
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

    static void modifyingArrayInMethod(int[] b) {
        // 전달받은 height 배열을 참조하는 배열 b를 수정했을때의 결과 확인 메서드
        System.out.println("-----in method------");
        System.out.print("b[] 값 확인 : ");
        for (int data:b) {
            System.out.print(data+" ");
        }
        System.out.println();
        System.out.println("--b[] 값 수정--");
        for (int i = 0; i < b.length; i++) {
            b[i]=i;
        }
        System.out.print("수정된 b[] 값 확인 : ");
        for (int data:b) {
            System.out.print(data+" ");
        }
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("키의 최댓값을 구합니다.");
        System.out.print("사람 수 : ");
        int num = stdIn.nextInt(); // 배열의 요솟수를 입력받음

        int[] height = new int[num]; // 요솟수가 num인 배열을 생성

        for (int i = 0; i < num; i++) {
            System.out.print("height[" + i + "] : ");
            height[i] = stdIn.nextInt();
        }

        System.out.println("최댓값은 "+maxOf(height)+"입니다.");

        System.out.println("===================");
        System.out.println("modifyingArrayInMethod test");
        System.out.print("height[] 값 확인 : ");
        for (int data:height) {
            System.out.print(data+" ");
        }
        System.out.println();

        modifyingArrayInMethod(height); // run method
        System.out.println();

        System.out.println("------out method-------");
        System.out.print("height[] 값 확인 : ");
        for (int data:height) {
            System.out.print(data+" ");
        }

    }
}
