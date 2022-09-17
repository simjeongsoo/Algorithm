// 실습 2-2
// 배열 초기화

public class IntArrayInit {
    public static void main(String[] args) {
        int[] a = {1, 2, 3, 4, 5}; // 배열 초기화에 의해 생성

        for (int i = 0; i < a.length; i++) {
            System.out.println("a[" + i + "] = " + a[i]);
        }
        System.out.println("-----------");
        int cnt=0;
        for (int data: a) { // for-each 문으로 배열 출력
            System.out.println("a[" + cnt + "] = " + data);
            cnt++;
        }

    }
}
