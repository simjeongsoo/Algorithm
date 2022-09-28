// 실습 3C-1
// 클래스 생성자 테스트

class Id {
    private static int counter = 0;     // 아이디를 몇 개 부여했는지 저장    (클래스 변수)
    private int id;                     // 아이디                      (인스턴스 변수)

    public Id() {                       //                           (생성자)
        id = ++counter;
    }

    public static int getCounter() {    // counter를 반환하는 클래스 메서드 (클래스 메서드)
        return counter;
    }

    public int getId() {                // 아이디를 반환하는 인스턴스 메서드   (인스턴스 메서드)
        return id;
    }
}
public class IdTester {
    public static void main(String[] args) {
        Id a = new Id();    // 아이디 1
        Id b = new Id();    // 아이디 2

        System.out.println("a의 아이디 : " + a.getId());
        System.out.println("b의 아이디 : " + b.getId()); // 인스턴스 메서드 호출

        System.out.println("부여한 아이디의 개수 : " + Id.getCounter()); // 클래스 메서드 호출
    }
}
