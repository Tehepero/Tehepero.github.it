package operator;

public class W15 {
    public static void main(String[] args) {
//        // for문
//        // (초기값 ; 조건문 ; 증가연산)
//        for ( int i = 0; i < 4 ; i++) { //int = 0이고 i가 4가 될떄까지 매번 i ++ 1씩 더해줘겠네
//            System.out.println(i+ " 번째 출력!");
//        }

        // 향상된 for문
        // 기존 : for문안에 3개의 표현이 들어감
        // 향상된 for문 : 2개로 줄여줌
//        int[] numbers = {3, 6, 9, 12, 15};
//        for (int number : numbers) { // 한개씩 찍히며나옴 순서대로
//            System.out.print(number + " ");
//        }

        int[] numbers = {3, 6, 9, 12, 15};
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
            // 위의 향상된 for문을 다시 일반 for문으로 바꿔봤음 ㅇㅇ
        }


    }
}