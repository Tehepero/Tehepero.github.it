package Review;

import java.util.Scanner;

public class Calculator1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //입력을 위해 스캐너 사용

        System.out.println("계산기 입니다");
        System.out.print("첫번째 숫자를 입력해주세요 : ");
        int firstNum = sc.nextInt();
        System.out.print("두번째 숫자를 입력해주세요 : ");
        int secondNum = sc.nextInt();
        sc.nextLine(); // null? 값 제거 /n 까먹으면 작동안함 중요!
        System.out.print("원하는 사칙연산 기호를 입력해주세요 : ");
        String operator = sc.nextLine();

        int finalresult = 0;

        if ("+".equals(operator)) {
            finalresult = firstNum + secondNum;
        } else if ("-".equals(operator)) {
            finalresult = firstNum - secondNum;
        } else if ("*".equals(operator)) {
            finalresult = firstNum * secondNum;
        } else if ("/".equals(operator)) {
            finalresult = firstNum / secondNum;
        } else {
            System.out.print("계산 가능한 사칙연산 기호가 아닙니다");
        }

        System.out.print(firstNum + " ");
        System.out.print(operator + " ");
        System.out.println(secondNum + " ");
        System.out.print("계산결과 = " + finalresult);
    }
}
