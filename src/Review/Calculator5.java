package Review;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Calculator5 {
    public static void main(String[] args) {
        // 계산기 만드는 복습중
        Scanner sc = new Scanner(System.in);
        // 스캐너로 입력 받을수 있게
        
        while (true) {
            System.out.println(" 사칙연산 게산기 입니다 계속하려면 아무키나 누르십시오 ");
            System.out.println(" 종료를 원하면 exit 를 입력하세요 ");
            String exit = sc.nextLine();

            if (exit.equals("exit")) {
                break;
            }

            System.out.print(" 첫번째 숫자를 입력해 주세요 : ");
            double firstNum = sc.nextInt();
            System.out.print(" 두번째 숫자를 입력해 주세요 : ");
            double secondNum = sc.nextInt();
            sc.nextLine(); // null 포인트입센션? 방지용 빈공간 제거용 코드
            System.out.print(" 사칙연산 기호를 입력해 주세요 : ");
            String operator = sc.nextLine();

            double result = 0;

            if (("+").equals(operator)) {
                result = firstNum + secondNum;
            } else if (("-").equals(operator)) {
                result = firstNum - secondNum;
            } else if (("*").equals(operator)) {
                result = firstNum * secondNum;
            } else if (("^").equals(operator)) {
                result = 1; // 와이?????????????????????????????????????
               for (int i = 0; i < secondNum; i++) {
                   result = result * firstNum; // 왼쪽 result = 공간 오른쪽 result = 실제 수 (누적됨!!)
                   // 첫번째 숫자 2 새컨드Num 3
                   // 2^1 = 2
                   // 2^2 = 2 x 2
                   // 2^3 = 2 x 2 x 2

                   // X = 1 * 2 = 2
                   // X = 2 * 2 = 4
                   // X = 4 * 2 = 8
                   System.out.print("아무거나");
               }
            } else if (("/").equals(operator)) {
                if (secondNum == 0) {
                    System.out.print(" 0 으로는 나눌수 없습니다!!! ");
                } else {
                    result = (double) firstNum/ secondNum;
                }
            } else {
                System.out.print(" 유효하지 않은 사칙연산 기호입니다 ");
            }

            System.out.println(" 계산식 : " + firstNum + " " + operator + " " + secondNum);
            System.out.println(" 계산결과 : " + result);
        }
    }
}
