// 실습 3C-3
// 제네릭 클래스의 예

public class GenericClassTester {
    // 제네릭 클래스의 매개변수를 T 라고 작성함
    static class GenericClass<T>{
        private T xyz;

        GenericClass(T t) { // 생성자
            this.xyz = t;
        }

        T getXyz() {        // xyz getter
            return xyz;
        }
    }

    public static void main(String[] args) {
        // 다음과 같이 매개변수에 String을 넘길 수도 있고 Integer를 넘길 수도 있음
        GenericClass<String> s = new GenericClass<>("ABC");
        GenericClass<Integer> n = new GenericClass<>(15);

        System.out.println(s.getXyz());
        System.out.println(n.getXyz());

    }
}
