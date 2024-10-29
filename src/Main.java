// 클래스
// public : 접근제어자, public(공공의, 공통의) 공통이기 때문에 어디서나 접근 가능

//import java.util.Arrays; // im(in) + port(항구) 안쪽 항구로 가져오는것 = 수입
//import java.util.Scanner;

//public class Main { //메인클래스의 하위요소 => 메소드가있음 !중요! 이름은 같아야함!!! 파일명이랑
    //음 컴파일러가 Main의 이름으로 .class를 만든다

    // JDK 기능 3개
    // 1 .JAVA => .class 로 변경하는 컴파일러 역활
    // 2 JRE  Java Runtime enviroment, 즉 자바 실행 환경 의 약자
    // 3 JDB : 디버깅 역활

    // () : 소괄호
    // {} : 중괄호
    // [] : 대괄호

    // main 메소드가 반드시 있어야함
    // 자바 프로젝트(앱)은, 제일 먼저 클래스의 main 메소드를 실행시키는것이
    // JVM의 약속이기 떄문임

//    public static void main(String[] args) {
        // output 위치   // input 위치
        // 결국 중요한것은 void 자리는 아웃풋 String[] args 는 인풋이다
        // String[] 은 입력 args에 대한 데이터 타입이다!!!!!!!!!!!!!!!!!!!!

        // static : 이 프로그램이 시작될때 무조건 실행되는 녀석임을 표현

        // output
        // void : 메서드의 출력값의 데이터 타입을 결정하는 위치 => void 아무것도 없다 => 출력은 없다
        // 추후에 void 대신 string 같은게 들어갈수 있음 (타입!!!!!!!!)

        // input
        // String[] args : 위치는 매개변수 자리
        // String[] <= input에 대한 변수명이 args 인것 변수명은 아무거나 써도 된다

        // 객체 : 특징(속성, 변수), 행동(메소드)
        // print -> 줄 바꿈 X
        // println -> 줄 바꿈 o
//        System.out.print("Our First ");
//        System.out.print("Project! :)");

        // . 은 보통 ~안 시스템 안의 아웃 안의 프린트인 (메소드)
        // out = 객체 println의 메소드를 포함하고있다 () 으로써 실행

//        System.out.println(7);
//        System.out.println(3);
//        System.out.println(3.14);
//        System.out.println("JAVA");

//       boolean ok = true;
//       ok = false;
//
//        System.out.println(ok);
//        char alphabet = 'a';
//        System.out.println(alphabet);

//        byte byteNumber = 127; // 가운대 낙타혹처럼 튀어나온듯? = 카멜케이스
//        short shortNumber = 32767;
//        int intNumber = 2147483647;
//        long longNumber = 2147483647L;
//
//        System.out.println(byteNumber);
//        System.out.println(shortNumber);
//        System.out.println(intNumber);
//        System.out.println(longNumber);

        // 실수형
        // float(4byte),double(8byte)

//        float floatNumber = 0.123F;
//        double doubleNumber = 0.123123132;
//
//        System.out.println(floatNumber);
//        System.out.println(doubleNumber);

        // 참조형
        // (1) 문자열 변수
//        String helloWorld = "Hello World";
//
//        System.out.println(helloWorld);

        // (2) 배열
//        int[] a = {1, 2, 3};
//
//        System.out.println(Arrays.toString(a));

        // Wrapper Class 변수
//        int number = 21;
//
//        Integer num = number; // 이게 래퍼 클래스임 number 변수를 인티저로 래퍼 하였음 => boxing
//
//        System.out.println(num.intValue()); // unboxing

//    }
//}

public class Main {
    public static void main(String[] args) {
        // 형 변환 예제 : 변수의 타입을 바꾸는 방법
        // 문자열 -> 숫자
        // 정수 -> 실수
        // 실수 -> 정수

        // double형 or float형 -> int
        // 실수 -> 정수 (0.xxx -> 0)

//        double doubleBeonsu = 10.101010;
//        float floatBeonsu = 10.1010f;
//
//        // 변환(int)
//        int intNumber;
//        intNumber = (int)floatBeonsu;
//        System.out.println("Float Type => " + floatBeonsu);
//        System.out.println("Int Type => " + intNumber);

//        intNumber = (int)doubleBeonsu; // double -> int
//        System.out.println("Double Type => " + doubleBeonsu);
//        System.out.println("Int Type => " + intNumber);
//        // 설명을 해보자면 doubleBenonsu 는 그대로 10.101010이 잘 출력된게 맞고
//        // intNumber 114줄에서 int로 변환한 더블변수라고 명령어로 변환을 했기때문에 int로 변환된 10이 나오는것임!

//        // 정수 -> 실수
//        int intNumber =10;
//
//        double doubleNumber = (double)intNumber;
//        float floatNumber = (float)intNumber;
//
//        System.out.println("intNumber = " + intNumber);
//        System.out.println("doubleNumber => " + doubleNumber);
//        System.out.println("floatNumber => " + floatNumber);

        // 자동으로 변환될수 있음 타입별 순서만 안다면 ㅇㅇ
        // 내가외운것은 byte(1) < short(2) < int(4) < long(8) < float(4) < double(8)

//        // (1) byte -> int
//        byte byteNumber = 10;
//        int intNumber = byteNumber;
//        System.out.println(intNumber);
//
//        // (2) char(캐릭터타입) 1바이트 -> int (4바이트) 형변환
//        char charAlphabet = 'A';
//        intNumber = charAlphabet; // intNumber는 인트이고 인트는 4바이트기 때문에 자동 형변환
//        System.out.println(intNumber);
//        //65가 출력이 되는대 65는 A의 유니코드이다 아스키코드부분 강의 전강의 다시보면 이해갈거임
//
//        // Int -> long number 형변환
//        intNumber = 100;
//        long longNumber = intNumber;
//        System.out.println(longNumber);
//
//        // (4) int -> double 형으로 형변환
//        intNumber = 200;
//        double doubleNumber = intNumber;
//        System.out.println(doubleNumber);
//        // 가장 많은 변수타입으로 실수형으로 나옴 float 도 마찬가지일거같은대 해보자
//
//        // (5) int -> float 형으로 변환
//        intNumber = 300;
//        float floatNumber = intNumber;
//        System.out.println(floatNumber);

        // 마지막임 작은 크기의 타입이 큰 크기의 타입과 '계산'될 때,
        // 당연히 자동으로 큰 크기의 타입으로 형 변환이 됩니다
        int intNumber = 10;
        double doubleNumber = 5.5;
        double result = intNumber + doubleNumber;
        System.out.println("인트넘버랑 더블넘버 더하기 결과 = " + result);

        // 1) 정수로 나누기
        int iResult = intNumber / 4; // 2 소수점까지 않나옴 => 값의 손실이 생김
        // 2) 실수로 나누기
        double dResult = intNumber / 4.0; // 2.5 제대로 소수점까지나옴

        System.out.println(iResult + " / " + dResult);

        // 2024-10-18 1주차 복습 완료
    }
}