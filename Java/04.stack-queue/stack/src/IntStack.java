// 스택 구현 프로그램 구현
// 기본 구조를 익히기 위해 스택을 생성할 때 용량(스택에 쌓을 수 있는 최대 데이터 수)을 결정하는 고정 길이 스택을 만듬
// int 형 고정 길이 스택

public class IntStack {
    private int[] stk; // 스택용 배열
    private int capacity; // 스택 용량
    private int ptr; // 스택 포인터

    public class EmptyIntStackException extends RuntimeException {
        //--실행 시 예외 : 스택이 비어 있음--//
        public EmptyIntStackException(){}
    }

    public class OverflowIntStackException extends RuntimeException {
        //--실행 시 예외 : 스택이 가득 참--//
        public OverflowIntStackException(){}
    }

    public int push(int x) throws OverflowIntStackException{
        //--스택에 x를 푸시--//
        if (ptr >= capacity)                 // 스택이 가득참
            throw new OverflowIntStackException();
        return stk[ptr++] = x;
    }

    public int pop() throws EmptyIntStackException{
        //--스택에서 데이터를 팝(꼭대기에 있는 데이터를 꺼냄)--//
        if (ptr <= 0)                       // 스택이 비어있음
            throw new EmptyIntStackException();
        return stk[ptr--];
    }

    public int peek() throws EmptyIntStackException {
        //--스택에서 데이터를 피크(꼭대기에 있는 데이터를 들여다봄)--//
        if (ptr <= 0)                       // 스택이 비어있음
            throw new EmptyIntStackException();
        return stk[ptr - 1];
    }

    public void clear() {
        //--스택을 비움--//
        ptr = 0;
    }

    public int indexOf(int x) {
        //--스택에서 x를 찾아 인덱스(없으면 -1)를 반환--//
        for (int i = ptr - 1; i >= 0; i--)          // 꼭대기 쪽부터 선형 검색
            if (stk[i] == x) return i;              // 검색 성공
        return -1;                                  // 검색 실패
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

    // 생성자
    public IntStack(int maxLen) {
        ptr = 0;
        capacity = maxLen;
        try {
            stk = new int[capacity];        // 스택 본체용 배열 생성
        } catch (OutOfMemoryError e) {      // 생성할 수 없음
            capacity = 0;
        }
    }

}