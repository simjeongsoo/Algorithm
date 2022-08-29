// 여러 값에 대한 최댓값을 구하여 출력

public class Max3Method {
    public static void main(String[] args) {
        System.out.println("max(3,2,1) = " + max3(3,2,1));
        System.out.println("max(3,2,1) = " + max3(3,2,2));
        System.out.println("max(3,2,1) = " + max3(3,1,2));
        System.out.println("max(3,2,1) = " + max3(3,2,3));
    }

    // 여러번 반복해서 구하기 위한 메서드 처리
    static int max3(int a, int b, int c) {
        int max = a;
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }

        return max;
    }
}
