// Q4
// 배열 요소를 앞쪽으로 옮기는 큐를 구현하는 프로그램 작성

public class IntArrayQueue {
    private int[] que;      // 큐용 배열
    private int capacity;   // 큐 용량
    private int num;        // 현재 데이터 개수

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {
        }
    }

    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {
        }
    }

    public IntArrayQueue(int maxLen) {
        num = 0;
        capacity = maxLen;
        try {
            que = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public int enque(int x) {
        //--- 큐에 데이터를  인큐 ---//
        if (num >= capacity) {
            throw new OverflowIntQueueException();
        }
        que[num++] = x;
        return x;

    }

    public int deque() {
        //--- 큐에서 데이터를  디큐 ---//
        if (num <= 0) throw new EmptyIntQueueException();
        int x = que[0];
        for (int i = 0; i < num; i++) {
            que[i] = que[i + 1];
        }
        num--;
        return x;
    }

    public int peek() {
        if (num <= 0) throw new EmptyIntQueueException();
        return que[num - 1];
    }

    public int indexOf(int x) {
        for (int i = 0; i < num; i++) {
            if (que[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public void clear() {
        num = 0;
    }

    public int capacity() {
        return capacity;
    }

    public int size() {
        return num;
    }

    public boolean isEmpty() {
        return num <= 0;
    }

    public boolean isFull() {
        return num >= capacity;
    }

    public void dump() {
        for (int i = 0; i < num; i++) {
            System.out.println(que[i]);
        }
    }

}