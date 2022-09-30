// Q2
// 임의의 객체형 데이터를 쌓을 수 있는 제네릭 스택 클래스 Stack<E>

public class Stack<E> {
    private E[] stk;            // 스택 배열
    private int capacity;       // 스택 용량
    private int ptr;            // 스택 포인터

    public static class EmptyGstackException extends RuntimeException {
        //--실행 시 예외 : 스택이 비어 있음--//
        public EmptyGstackException(){}
    }

    public static class OverflowGstackException extends RuntimeException {
        //--실행 시 예외 : 스택이 가득 참--//
        public OverflowGstackException(){}
    }

    //--Constructor--//
    public Stack(int maxLen) {
        ptr = 0;
        capacity = maxLen;
        try {
            stk = (E[]) new Object[capacity]; // 제네릭 배열로 형변환 후 객체 인스턴스 생성
        } catch (OutOfMemoryError e) {
            capacity = 0;                     // 생성할 수 없음
        }
    }

    public E push(E x) throws OverflowGstackException {
        //--스택에 x를 푸시--//
        if (ptr >= capacity) throw new OverflowGstackException();
        return stk[ptr++] = x; // 스택 배열에 x를 push 하고 포인터 증가
    }

    public E pop() throws EmptyGstackException {
        //--스택에서 데이터를 팝(꼭대기에 있는 데이터를 꺼냄)--//
        if (ptr <= 0) throw new EmptyGstackException();
        return stk[--ptr]; // 포인터 위치 변경 후 리턴
    }

    public E peek() throws EmptyGstackException {
        //--스택에서 데이터를 피크(꼭대기에 있는 데이터를 들여다봄)--//
        if (ptr <= 0) throw new EmptyGstackException();
        return stk[ptr - 1]; // 포인터 -1 위치의 데이터 리턴
    }

    public void clear() {
        //--스택을 비움--//
        ptr = 0;
    }

    public int indexOf(E x) {
        //--스택에서 x를 찾아 인덱스(없으면 -1)를 반환--//
        for (int i = ptr - 1; i >= 0; i--)  // 꼭대기 쪽부터 선형 검색
            if (stk[i].equals(x)) return i;
        return -1;
    }

    public int getCapacity() {
        //--스택의 용량을 반환--//
        return capacity;
    }

    public int size() {
        //--스택에 쌓여 있는 데이터 개수를 반환--//
        return ptr;
    }

    public boolean isEmpty() {
        //--스택이 비어 있는가?--//
        return ptr <= 0;
    }

    public boolean isFull() {
        //--스택이 가득 찼는가?--//
        return ptr >= capacity;
    }

    public void dump() {
        //--스택 안의 모든 데이터를 바닥 -> 꼭대기 순서로 출력 --//
        if (ptr <= 0) System.out.println("스택이 비어 있습니다.");
        else {
            System.out.printf("-----bottom-----\n");
            for (int i = 0; i < ptr; i++) {
                System.out.println("ptr["+i+"] - "+"|  "+stk[i]+"  |");
            }
            System.out.println("------top------");
        }
    }
}
