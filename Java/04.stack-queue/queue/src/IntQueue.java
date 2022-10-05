// 실습 4-3A
// 링버퍼로 큐 만들기
// int형 고정 길이 큐

public class IntQueue {
    private int[] que;      // 큐용 배열
    private int capacity;   // 큐의 용량
    private int front;      // 맨 앞의 요소 커서
    private int rear;       // 맨 뒤의 요소 커서
    private int num;        // 현재 데이터 개수

    public class EmptyIntQueueException extends RuntimeException {
        public EmptyIntQueueException() {
        }
    }

    public class OverflowIntQueueException extends RuntimeException {
        public OverflowIntQueueException() {
        }
    }

    public IntQueue(int maxlen) {
        num = front = rear = 0;
        capacity = maxlen;
        try {
            que = new int[capacity];
        } catch (OutOfMemoryError e) {
            capacity = 0;
        }
    }

    public int enque(int x) throws OverflowIntQueueException {
        if (num >= capacity) throw new OverflowIntQueueException();
        que[rear++] = x;            // 리어에 인큐
        num++;                      // 데이터 개수 증가

        if (rear == capacity)       // rear 값을 1 증가시켰을 때 큐의 최대 용량값인 capacity와 같아질 경우
            rear = 0;               // rear을 첫 인덱스인 0으로 변경
        return x;                   // 인큐한 데이터 반환
    }

    public int deque() throws EmptyIntQueueException {
        if (num <= 0) throw new EmptyIntQueueException();   // 큐가 비어있다면 Exception 터짐
        int x = que[front++];                               // front 값을 꺼내고 인덱스 증가
        num--;                                              // 데이터 개수 감소

        if (front == capacity)                              // 1 증가시킨 front값이 큐 용량인 capacity와 같아지면
            front = 0;                                      // front값을 배열의 맨 앞 인덱스인 0으로 변경
        return x;                                           // 디큐한 데이터 반환
    }
}
