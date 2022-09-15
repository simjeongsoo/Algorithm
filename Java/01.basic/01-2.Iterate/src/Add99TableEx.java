// Q12
// 덧셈을 출력하는 프로그램

public class Add99TableEx {
    public static void main(String[] args) {
        System.out.print("   |");
        for (int i = 1; i <= 9; i++) {
            System.out.printf("%3d",i);
        }
        System.out.printf("\n---+---------------------------");

        for (int i = 1; i <= 9; i++) {
            System.out.printf("\n%2d |",i);
            for (int j = 1; j <= 9; j++) {
                System.out.printf("%3d",i+j);
            }
        }
    }
}
