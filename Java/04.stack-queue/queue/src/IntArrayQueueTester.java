// Q4
// 배열 요소를 앞쪽으로 옮기는 큐를 구현하는 프로그램 작성

import java.util.Scanner;

public class IntArrayQueueTester {
    public static void main(String[] args) {
        IntArrayQueue queue = new IntArrayQueue(64);
        Scanner stdIn = new Scanner(System.in);

        while (true) {
            System.out.printf("현재 데이터 개수 : %d / %d\n", queue.size(), queue.capacity());
            System.out.print("(1) 인큐 (2) 디큐 (3) 피크 " +
                    "(4) 덤프 (5) 검색 (6) 비움 " +
                    "   (0) 종료 : ");

            int menu = stdIn.nextInt();
            if (menu == 0) break;

            int x;
            switch (menu) {
                case 1:
                    System.out.print("데이터 : ");
                    x = stdIn.nextInt();
                    try {
                        queue.enque(x);
                    } catch (IntArrayQueue.OverflowIntQueueException e) {
                        System.out.println("큐가 가득 찼습니다.");
                    }break;
                case 2:
                    try {
                        System.out.println("디큐 한 데이터는 "+queue.deque()+"입니다.");
                    } catch (IntArrayQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }break;
                case 3:
                    try {
                        System.out.println("피크 한 데이터는 " + queue.peek() + "입니다.");
                    } catch (IntArrayQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }break;
                case 4:
                        queue.dump();
                        break;
                case 5:
                    System.out.print("데이터 : ");
                    x = stdIn.nextInt();
                    try {
                        System.out.println("검색한 데이터는 que[" + queue.indexOf(x) + "]에 있습니다.");
                    } catch (IntArrayQueue.EmptyIntQueueException e) {
                        System.out.println("큐가 비어 있습니다.");
                    }break;
                case 6:
                    queue.clear();
                    System.out.println("clear queue");
                    break;
            }

        }
    }
}
