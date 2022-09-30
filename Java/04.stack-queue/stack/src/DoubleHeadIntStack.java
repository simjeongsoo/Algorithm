public class DoubleHeadIntStack {
    private int[] stk; // 스택 배열
    private int capacity; // 스택 A,B 의 전체 용량
    private int ptrA; // 포인터 A
    private int ptrB; // 포인터 B

    public enum AorB{StackA, StackB};

    public class EmptyDoubleHeadIntStackException extends RuntimeException {
        public EmptyDoubleHeadIntStackException() {
        }
    }

    public class OverflowDoubleHeadIntStackException extends RuntimeException {
        public OverflowDoubleHeadIntStackException(){}
    }

    public DoubleHeadIntStack(int maxLen) {
        // 생성자
        ptrA = 0;
        ptrB = maxLen - 1; // 0 ~ 63
        capacity = maxLen;
        try {
            stk = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;                   // 생성 할 수 없음
        }
    }

    public int push(AorB sw, int x) throws OverflowDoubleHeadIntStackException {
        if (ptrA >= ptrB + 1) throw new OverflowDoubleHeadIntStackException();
        switch (sw) {
            case StackA: stk[ptrA++] = x; break;
            case StackB: stk[ptrB--] = x; break;
        }
        return x;
    }

    public int pop(AorB sw) throws EmptyDoubleHeadIntStackException {
        int x = 0;
        switch (sw) {
            case StackA:
                if (ptrA <= 0) throw new EmptyDoubleHeadIntStackException();
                x = stk[--ptrA];
                break;
            case StackB:
                if (ptrB >= capacity - 1) throw new EmptyDoubleHeadIntStackException(); // 스택 b 가 비어있음
                x = stk[++ptrB];
                break;
        }
        return x;
    }

    public int peek(AorB sw) throws EmptyDoubleHeadIntStackException {
        int x = 0;
        switch (sw) {
            case StackA:
                if (ptrA <= 0) throw new EmptyDoubleHeadIntStackException();
                x = stk[ptrA - 1];
                break;
            case StackB:
                if (ptrB >= capacity - 1) throw new EmptyDoubleHeadIntStackException();
                x = stk[ptrB + 1];
                break;
        }
        return x;
    }

    public int indexOf(AorB sw, int x) {
        switch (sw) {
            case StackA:
                for (int i = ptrA - 1; i >= 0; i--)  // 꼭대기 쪽에서 선형검색
                    if (stk[i] == x) return i;
                break;
            case StackB:
                for (int i = ptrB + 1; i < capacity; i++) // 꼭대기 쪽에서 선형 검색
                    if (stk[i] == x) return i;
                break;
        }
        return -1;
    }

    public void clear(AorB sw) {
        switch (sw) {
            case StackA: ptrA = 0; break;
            case StackB: ptrB = capacity - 1; break;
        }
    }

    public int size(AorB sw) {
        switch (sw) {
            case StackA: return ptrA;
            case StackB: return capacity - ptrB - 1;
        }
        return 0;
    }

    public int getCapacity() {
        //--A 와 B 의 합계 용량--//
        return capacity;
    }

    public boolean isEmpty(AorB sw) {
        switch (sw) {
            case StackA: return ptrA <= 0;
            case StackB: return ptrB >= capacity - 1;
        }
        return true;
    }

    public boolean isFull() {
        return ptrA >= ptrB + 1;
    }

    public void dump(AorB sw) {
        switch (sw) {
            case StackA:
                if (ptrA <= 0)
                    System.out.println("스택이 비어 있습니다.");
                else {
                    for (int i = 0; i < ptrA; i++)
                        System.out.print(stk[i] + " ");
                    System.out.println();
                }
                break;
            case StackB:
                if (ptrB >= capacity - 1)
                    System.out.println("스택이 비어 있습니다.");
                else {
                    for (int i = capacity - 1; i > ptrB; i--)
                        System.out.print(stk[i] + " ");
                    System.out.println();
                }
                break;
        }
    }
}

