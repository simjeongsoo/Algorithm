import java.util.Scanner;

public class FactorialEx {

    static int factorial(int n) {
        int fact = 1;
        while (n > 1) {
            fact *= n--;
        }
        return fact;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력 하세요 : ");
        int n = stdIn.nextInt();

        System.out.println(n+"의 팩토리얼은 "+factorial(n)+"입니다.");
    }
}
