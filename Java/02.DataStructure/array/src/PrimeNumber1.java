// 실습 2-7
// 1000 이하의 소수를 나열(v1)

public class PrimeNumber1 {
    public static void main(String[] args) {
        int counter = 0; // 나숫셈의 횟수

        for (int n = 2; n <= 1000; n++) { // 2~1000 까지 순차반복
            int i; // 나누는 수
            for (i = 2; i < n; i++) {
                counter++;
                if (n % i == 0) // 나누어 떨어지면 소수가 아님
                    break;        // 반복 종료
            }
            if (n == i)      // 마지막까지 나누어 떨어지지 않음
                System.out.println(n);
        }
        System.out.println("나눗셈을 수행한 횟수 : " + counter);
    }
}
