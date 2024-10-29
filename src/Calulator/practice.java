package Calulator;

import java.util.Scanner;

//public class practice {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        // 입력을 받기위하여 Scanner를 사용하여 사용자가 숫자를 입력할수있게 한다
//
//        System.out.print("첫번째 숫자를 입력하세요 ");
//        // "첫번째 숫자를 입력하세요" 내용을 sout 명령어를 통해 보이게 한다
//
//        int firstNum = sc.nextInt();
//        // 첫번째 숫자를 입력받는다
//
//        System.out.print("두번째 숫자를 입력하세요 ");
//        // "두번째 숫자를 입력하세요" 내용을 sout 명령어를 통해 보이게 한다
//
//        int secondNum = sc.nextInt();
//        // 두번째 숫자를 입력받는다
//
//        System.out.print("사칙연산 기호를 입력하세요 ");
//        // "사칙연산 기호를 입력하세요" 내용 도출
//
//        sc.nextLine();
//
//        String input = sc.nextLine(); // 개행이 먹혀있음 위에서 숫자입력시 작성했던 엔터가 남아있음
//        // 3. 사칙기호를 입력받는다
//
//        System.out.print("계산결과 = " + (firstNum + secondNum));
//        // 4. 계산결과를 도출한다 <== 현재불가능 (더하기만 됩니다...)
//    }
//}

public class practice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // 입력 관련내용
        // 입력을 받기위하여 Scanner를 사용하여 사용자가 숫자를 입력할수있게 한다

        System.out.print("첫번째 숫자를 입력하세요 ");
        // "첫번째 숫자를 입력하세요" 내용을 sout 명령어를 통해 보이게 한다

        int firstNum = sc.nextInt();
        // 첫번째 숫자를 입력받는다

        System.out.print("두번째 숫자를 입력하세요 ");
        // "두번째 숫자를 입력하세요" 내용을 sout 명령어를 통해 보이게 한다

        int secondNum = sc.nextInt();
        // 두번째 숫자를 입력받는다

        System.out.print("사칙연산 기호를 입력하세요 ");
        // 출력관련 내용
        // "사칙연산 기호를 입력하세요" 내용 도출

        sc.nextLine();

        String input = sc.nextLine(); // 개행이 먹혀있음 위에서 숫자입력시 작성했던 엔터가 남아있음
        // 3. 사칙기호를 입력받는다

        System.out.print("계산결과 = " + (firstNum + " " + input + " " + secondNum));
        // 4. 계산결과를 도출한다 <== 현재불가능 (더하기만 됩니다...)

    }
}
