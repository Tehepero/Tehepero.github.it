package Test;

public class Test1028 {
    public static void main(String[] args) {

//        // 1번
//        int a = 5;
//        int b = 3;
//        int sum = a + b;
//        System.out.println(sum);
//
//        // 2번
//         a = 10;
//         b = 20;
//        int average = (a + b)/2;
//        System.out.println(average);
//
//        // 3번
//        a = 17;
//        b = 5;
//        int result = a / b;
//        int result2 = a % b;
//        System.out.println("몫 = " + result + " 나머지 = " + result2);
//
//        // 4번 (비교연산자)
//        a = 10;
//        b = 10;
//        boolean reult = (a == b);
//        System.out.println("a와 b의 값이 같나요? = " + reult);
//
//        // 5번 (더 큰수 출력)
//        a = 7;
//        b = 12;
//        if (a > b) {
//            System.out.println("a가 더 큽니다");
//        } else {
//            System.out.println("b가 더 큽니다");
//        }
//
//        // 6번 (가장 큰 수)
//        a = 5;
//        b = 8;
//        int c = 3;
//
//        if (a > b && a > c) {
//            System.out.println("a가 가장 큽니다");
//        } else if (c > b && c > a) {
//            System.out.println("c가 가장 큽니다");
//        } else
//            System.out.println("b가 가장 큽니다");
//
//        // 일단 1번부터 주석처리

        // 7번 (논리 연산자)
        boolean a = true;
        boolean b = false;
        boolean result = a && b;
        System.out.println("(AND문) 둘다 참이여야 true가 나옵니다 => 결과 = " + result);

        // 문제 8: 주어진 조건 중 하나라도 참인지 확인하는 프로그램을 작성하세요.
        a = true;
        b = false;
        result =  a || b;
        System.out.println("(OR문) 둘중 하나라도 참이여야 true가 나옵니다 => 결과 = " + result);

        // 문제 9: 세 개의 조건이 모두 거짓인지 확인하는 프로그램을 작성하세요.
        a = false;
        b = false;
        boolean c = false;
        result = !a && !b && !c;
        System.out.println("a,b,c 전부 거짓이여야 true가 나옵니다 => 결과 = " + result);

        // ### 4. **대입 연산자 (Assignment Operators)**
        //대입 연산자는 변수에 값을 할당할 때 사용됩니다. `=`, `+=`, `-=`, `*=`, `/=`, `%=` 등이 있습니다.

        //**문제 10:** 대입 연산자를 사용하여 값을 추력하는 프로그램을 작성하세요.
        System.out.println("문제 10번");
        int d = 10;
        // 더하여 a = 15
        // 곱하여 a = 30
        // 빼서 a = 20
        d = d + 5;
        System.out.println(d);
        d = d * 2;
        System.out.println(d);
        d = d - 10;
        System.out.println(d);

        //문제 11: 두 변수의 값을 서로 바꾸는 프로그램을 작성하세요.
        System.out.println("문제 11번");
         d = 5;
         int e = 10;
         // swap a and b
//        int f = f;







    }
}
