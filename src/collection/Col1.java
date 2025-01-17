package collection;

import java.util.ArrayList;

public class Col1 {
    public static void main(String[] args) {
        // List
        // 순서가 있는 데이터의 집함임 => Array랑 상당히 비슷하지만 (최초 길이를 알아야함)
        // 처음에 길이를 몰라도 만들수가 있음!
        // 이유는 특징이 달라서 그런대 ->
        // 1) Array -> 정적배열
        // 2) List(ArrayList) -> 동적배열 (크기가 가변적으로 늘어남)
        // - 생성 시점에 작은 연속된 공간을 요청해서 참조형 변수들을 담아놓는다
        // - 값이 추가될 때 더 큰 공간이 필요하면 더 큰 공간을 받아서 저장하니깐 상관 X

        ArrayList<Integer> intList = new ArrayList<>(); // 선언과 생성을 같이함 / 선언 + 생성

        intList.add(99);
        intList.add(15);
        intList.add(3);

//        System.out.println(intList.get(1));

        // 2번째 있는 값(15)을 바꿔보자.
//        intList.set(1, 10);
//        System.out.println(intList.get(1));

        System.out.println(intList.get(0));
        // 삭제
        intList.remove(0);
        System.out.println(intList.get(0));

        System.out.println("클리어 전");
        System.out.println(intList.toString());
        intList.clear();
        System.out.println("클리어 후");
        System.out.println(intList.toString());
    }
}
