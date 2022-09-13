import java.util.Scanner;

// 실습 1-7
// 1부터 n까지 정수의 합 구하기

public class SumWhile {
    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.println("1부터 n 까지의 합을 구합니다");
        System.out.print("n값 : ");
        int n = stdIn.nextInt();

        int sum = 0; // 합
        int i = 1;

        while (i <= n) { // i가 n 이하면 반복함
            sum += i;    // sum 값에 i를 더함
            i++;         // i 값을 1만큼 증가
        }

//        for (int i = 1; i <= n; i++) {
//            sum += n - (n - i);
//        }

        System.out.println("1부터 " + n +"까지의 합은 "+sum+"입니다.");

    }
}
