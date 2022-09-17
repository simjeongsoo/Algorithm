// 실습 2-1
// 구성 요소의 자료형이 int 형인 배열(구성 요솟수는 5: new에 의해 본체를 생성

public class IntArray {
    public static void main(String[] args) {
        int[] a = new int[5]; // 배열의 선언

        a[1] = 37;
        a[2] = 51;
        a[4] = a[1] * 2;

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
