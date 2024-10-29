package collection;

import java.util.LinkedList;
import java.util.Queue;

public class Col4 {
    public static void main(String[] args) {
        // Queue : FIFO 원통모양 선입선출 구조 빨때 생각하면 됨
        // add, peek, poll
        //Queue : 생성자가 없는 인터페이스 3주차때 제대로 배울거임 대충보고가면됨 이번차수는

        Queue<Integer> intQueue = new LinkedList<>(); // queue를 선언, 생성

        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);

        while(!intQueue.isEmpty()) {
            System.out.println(intQueue.poll());
        }

        // 다시 추가
        intQueue.add(1);
        intQueue.add(5);
        intQueue.add(9);
        intQueue.add(10);


        // peak 조회
        System.out.println(intQueue.peek());
        System.out.println(intQueue.size());
    }
}
