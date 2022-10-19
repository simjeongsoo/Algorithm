// 실습 5-7
// 하노이의 탑을 구현하는 프로그램

import java.util.Scanner;

public class Hanoi {
    static void move(int no, int x, int y) {
        //--no개의 원반을 x번 기둥에서 y번 기둥으로 옮김--//
        if (no > 1) {
            // 시작기둥 -> 중간기둥
            move(no - 1, x, 6 - x - y);     // 중간기둥 : 6 - x - y ,
        }
        System.out.printf("원반[%d]를 %d번 기둥에서 %d번 기둥으로 옮김\n", no, x, y);
        if (no > 1) {
            // 중간기둥 -> 목표기둥
            move(no - 1, 6 - x - y, y);
        }

    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.println("하노이의 탑 ");
        System.out.print("원반의 개수 : ");
        int n = stdIn.nextInt();

        move(n, 1, 3); // 1번 기둥에 쌓인 n개의 원반을 3번 기둥으로 옮김
    }
}
