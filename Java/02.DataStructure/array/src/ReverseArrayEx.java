// Q2
// 배열의 요소를 역순으로 정렬하는 과정을 나타내는 프로그램

import java.util.Arrays;

public class ReverseArrayEx {
    static void swap(int[] b, int idx1, int idx2) {
        System.out.println("a["+idx1+"]과 a["+idx2+"]를 교환합니다.");
        int temp = b[idx1];
        b[idx1] = b[idx2];
        b[idx2] = temp;
        System.out.println(Arrays.toString(b));
    }
    static void reverse(int[] a) {
        for (int i = 0; i < a.length / 2; i++) {
            swap(a, i, a.length - i - 1);
        }
    }
    public static void main(String[] args) {
        int[] ary = {2, 5, 1, 3, 9, 6, 7};
        System.out.println(Arrays.toString(ary));

        reverse(ary);

        System.out.println("역순 정렬을 마쳤습니다.");
    }
}
