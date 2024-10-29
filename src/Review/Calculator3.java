package Review;

import java.util.Scanner;

public class Calculator3 {
    public static void main(String[] args) {
        // 계산기 만들어보자!! 복습중
        Scanner sc = new Scanner(System.in);
        // 입력받을수있게 스캐너 가져옴
        System.out.println("사칙연산 계산기 입니다 ");
        System.out.print("첫번째 숫자를 입력해 주세요 : ");
        int firstNum = sc.nextInt();
        System.out.print("두번째 숫자를 입력해 주세요 : ");
        int secondNum = sc.nextInt();
        sc.nextLine();
        System.out.print("원하는 사칙연산 기호를 입력해 주세요 : ");
        char operator = sc.next().charAt(0); // 처음 챠로 써봄

        double result = 0; // class 타입 X 원시타입 // 원시타입은 초기값을 뛰우고있다. 생성과 동시에 초기화



        // 조건문을 통해 기호에 따른 사칙연산 수행
        if (operator == '+') {
            result = firstNum + secondNum;
        } else if (operator == '-') {
            result = firstNum - secondNum;
        } else if (operator == '*') {
            result = firstNum * secondNum;
        } else if (operator == '/') {
            if (secondNum == 0) {
                System.out.print("0 으로는 나눌수 없습니다 ");
            } else {
                result = (double) firstNum / secondNum; // double 과 int의 차이로 줄이 생김 데이터타입이 맞지않음 더블로 캐스틸함
            }
        } else {
            System.out.print("잘못된 기호를 입력했습니다.");
        }

        // input 문자열을 입력하기 전까지는 무한 반복 => while 문을 사용하라고 함
        //        String input; // 비어있는값  이때가 null
        String input = ""; // String만 유일하게 대문자만있고 class 타입
        while (!input.equals("exit")) {
//            System.out.println("종료를 원하면 input ");
            input = sc.nextLine();
        }


        System.out.print(result);
    }
}
