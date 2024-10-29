package Calulator;

import java.util.Scanner;

public class Calulator {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        // 객체 변수명 = Scanner 클래스의 새로운 인스턴스 생성 ,
        // 시스템인은 사용자가 키보드를 통해 입력하는 데이터를 읽어들이기 위한 것
        System.out.print("첫번째 숫자를 입력하세요 : ");
        int firstNumber = sc.nextInt();
        // nextInt()는 Scanner 클래스의 메서드로, 사용자로부터 입력된 값을 정수형(int)으로 읽어옵니다.

        System.out.print("두번째 숫자를 입력하세요 : ");
        int secondNumber = sc.nextInt();
        sc.nextLine();

        System.out.print("사칙연산 기호를 입력하세요 : ");
        String operator = sc.nextLine();

        int result = 0;

        // String 은 == 사용 X
        if ("+".equals(operator)) {
            result = firstNumber + secondNumber;
        } else if ("-".equals(operator)) {
            result = firstNumber - secondNumber;
        } else if ("*".equals(operator)) {
            result = firstNumber * secondNumber;
        } else if ("/".equals(operator)) {
            result = firstNumber / secondNumber;
        } else {
            System.out.print("사칙 연산 기호가 아니에요");
        }

        System.out.print(firstNumber + " ");
        System.out.print(operator + " ");
        System.out.println(secondNumber + " ");
        System.out.print("계산결과 = " + result);
    }
}
