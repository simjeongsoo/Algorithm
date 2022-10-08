// Q3
// 배열 a의 모든 요소의 최대 공약수를 구하는 메서드를 작성

import java.util.Scanner;

public class GCDArray {

    static int gcd(int x, int y) {
        //--- 정숫값 x, y의 최대 공약수를 비재귀적으로 구하여 반환 ---//
        while (y != 0) {
            int temp = y;
            y = y % x;
            x = temp;
        }
        return (x);

    }

    static int gcdArray(int[] a, int start, int no) {
        //--- 요솟수가 n인 배열 a의 모든 요소의 최대 공약수를 구합니다 ---//
        if (no == 1) return a[start];
        else if (no == 2) return gcd(a[start], a[start + 1]);
        else return gcd(a[start], gcdArray(a, start + 1, no - 1));
    }


    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);
        System.out.print("array length : ");
        int n = stdIn.nextInt();
        int[] x = new int[n];

        for (int i = 0; i < x.length; i++) {
            System.out.print("data : ");
            x[i] = stdIn.nextInt();
        }

        System.out.println("배열 a의 모든 요소의 최대 공약수는 "+gcdArray(x,0,n)+"입니다.");


    }
}
