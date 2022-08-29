// 네 값의 최댓값을 구하여 출력

public class Max4Method {
        public static void main(String[] args) {
            System.out.println("max = " + max4(1,2,3,4));
            System.out.println("max = " + max4(4,3,2,1));
            System.out.println("max = " + max4(1,1,2,2));
            System.out.println("max = " + max4(3,3,3,3));
        }

        static int max4(int a, int b, int c, int d) {
            int max = a;

            if (b > max) max = b;
            if (c > max) max = c;
            if (d > max) max = d;

            return max;
        }
}
