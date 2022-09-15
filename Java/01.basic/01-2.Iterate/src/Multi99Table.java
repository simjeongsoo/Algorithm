// 실습 1-16
// 이중 루프로 구구단 곱셈표 출력

import java.util.Scanner;

public class Multi99Table {
    public static void main(String[] args) {
        System.out.println("----- 구구단 곱셈표 -----");

        for (int i = 1; i <= 9; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.print(i*j+"\t");
            }
            System.out.println();
        }
    }
}
