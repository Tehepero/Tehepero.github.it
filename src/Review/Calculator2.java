package Review;

import java.util.Scanner;

public class Calculator2 {
    public static void main (String[] args) {
        // 천천히 계산기를 만들어보자..! 기억나는대로 일단 Scaaner 가져와야곘지
        Scanner sc = new Scanner(System.in);
        // 스캐너는 가져왔다
        // 이제 숫자 입력을 위한 기본 안내문과 명령어를 적어보자
        System.out.println("사칙연산 계산기 입니다");
        System.out.print("첫번째 숫자를 입력해 주세요 : ");
        int firstNum = sc.nextInt();
        System.out.print("두번째 숫자를 입력해 주세요 : ");
        int secondNum = sc.nextInt();
        sc.nextLine();
        System.out.print("원하는 사칙연산 기호를 입력해 주세요 : ");
        String operator = sc.nextLine();
        //oper에 밑줄이 있지만 일단 무시 never used 일뿐

        int result = 0;

        if ("+".equals(operator)) {
            result = firstNum + secondNum;
        } else if ("-".equals(operator)) {
            result = firstNum - secondNum;
        } else if ("*".equals(operator)) {
            result = firstNum * secondNum;
        } else if ("/".equals(operator)) {
            result = firstNum / secondNum;
        } else {
            System.out.print("유효하지 않은 사칙연산 기호입니다");
        }

        System.out.print("계산식 = " + firstNum + " ");
        System.out.print(operator + " ");
        System.out.println(secondNum + " ");
        System.out.print("계산결과 = " + result );

    }
}
