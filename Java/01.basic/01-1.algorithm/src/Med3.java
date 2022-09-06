// Q4 세 값의 대소관계인 13가지 조합의 중앙값을 구하여 출력
public class Med3 {

    // 세 값의 중앙값을 찾아 반환 하는 함수
    static int med3(int a, int b, int c) {
        if (a >= b) // a 가 b 보다 크거나 같고
            if (b >= c)
                return b;
            else if (c >= a)
                return a;
            else
                return c;
        else if (a > c)
            return a;
        else if (b > c)
            return c;
        else
            return b;
    }

    public static void main(String[] args) {
        System.out.println("med3(3,2,1) = " + med3(3,2,1));      // a＞b＞c
        System.out.println("med3(3,2,2) = " + med3(3,2,2));      // a＞b＝c
        System.out.println("med3(3,1,2) = " + med3(3,1,2));      // a＞c＞b
        System.out.println("med3(3,2,3) = " + med3(3,2,3));      // a＝c＞b
        System.out.println("med3(2,1,3) = " + med3(2,1,3));      // c＞a＞b
        System.out.println("med3(3,3,2) = " + med3(3,3,2));      // a＝b＞c
        System.out.println("med3(3,3,3) = " + med3(3,3,3));      // a＝b＝c
        System.out.println("med3(2,2,3) = " + med3(2,2,3));      // c＞a＝b
        System.out.println("med3(2,3,1) = " + med3(2,3,1));      // b＞a＞c
        System.out.println("med3(2,3,2) = " + med3(2,3,2));      // b＞a＝c
        System.out.println("med3(1,3,2) = " + med3(1,3,2));      // b＞c＞a
        System.out.println("med3(2,3,3) = " + med3(2,3,3));      // b＝c＞a
        System.out.println("med3(1,2,3) = " + med3(1,2,3));      // c＞b＞a
    }
}
