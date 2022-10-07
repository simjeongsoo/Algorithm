import java.util.Scanner;

public class Factorial {

    static int factorial(int n) {
        //--음이 아닌 정수 n의 팩토리얼 값을 반환--//
        if (n > 0) {
            return n * factorial(n-1);
        }
        else return 1;
    }

    static int factorial2(int n) {
        return (n > 0) ? n * factorial2(n - 1) : 1;
    }

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("정수를 입력 하세요 : ");
        int n = stdIn.nextInt();

        System.out.println(n+" 의 팩토리얼은 "+factorial(n)+"입니다.");

    }
}