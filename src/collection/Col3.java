package collection;

import java.util.Stack;

public class Col3 {
    // Stack
    // 수직으로 값을 쌓아놓고, 넣었다가 뺀다 first in, last out FILO(Basket)
    // push, peek, pop
    // 최근 저장된 데이터를 나열하고 싶거나, 데이터의 중복 처리를 막고 싶을 때 사용
    public static void main(String[] args) {
        Stack<Integer> intStack = new Stack<Integer>(); // 선언 및 생성

        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        // 다 지워질떄까지 출력해보자
        while(!intStack.isEmpty()) {
            System.out.println(intStack.pop()); // 인트스택이 바스켓모양인대 맨 상단에 있는것만 팝 뺴주는거임 
            // 젤 위에 쌓인 그놈이 sout으로 프린트가 되면서 빠진다라는 의미 1이 나중이니까 1이 pop이 되면서 출력이 될듯
        }

        // 다시 추가
        intStack.push(10);
        intStack.push(15);
        intStack.push(1);

        // peak (조회)
        System.out.println(intStack.peek());
        System.out.println(intStack.size());
    }
}
