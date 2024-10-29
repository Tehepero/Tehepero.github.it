package operator;

public class W04 {
    // 논리연산자
    // 비교 연산의 결과값으로 받을수 있는 boolean 값을 연결하는 연산자
    // 조건을 연결 하였을 때 boolean 값들을 조합하여 참 또는 거짓 값인 boolean 값을 출력
    // &&(AND), ||(||||||||||\\\\\\\||\\) ||(OR), !(NOT) 
    // 위에 기호는 외워둬야함 매번 나옴

    public static void main(String[] args) {
        boolean flag1 = true;
        boolean flag2 = true;
        boolean flag3 = false;

        System.out.println(flag1);
        System.out.println(flag2);
        System.out.println(flag3);
        System.out.println(" //////////////////////////////// ");

        // 피 연산자 중 하나라도 트루면 트루다 => 하나라도 = OR 을 의미 OR = 기호로 ||
        System.out.println(flag1 || flag2); // 하나만 true 여도 되는대 둘다 true 니까 당연 true
        System.out.println(flag1 || flag2 || flag3); // 3개중 2개가 true 니까 트루 하나만 있어도 true임
        System.out.println(" //////////////////////////////// ");

        // 피 연산자가 모두 트루이면 트루 => 그리고(AND 조건 기호로는 &&)
        System.out.println(flag1 && flag2); //당연히 1 2 둘다 트루니까 트루겠다
        System.out.println(flag1 && flag2 && flag3); // 3이 아니므로 모두가아니므로 false 하나라도 false가 존재하면 안됨
        System.out.println(" //////////////////////////////// ");

        // 본격적인 and 연산
        System.out.println(" //////////////////////////////// ");
        System.out.println((5 > 3) && (3 > 1)); // 둘다 투르이므로 ture 가 나와야할것
        System.out.println((5 > 3) && (3 < 1)); // 3은 1보다 작지않기때문에 and를 써도 안됨 false 가 나와야할것

        //  || OR
        System.out.println("---true-true-false---");
        System.out.println((5 > 3) || (3 > 1)); // true || true = true 둘중 하나라도 true면 true
        System.out.println((5 > 3) || (3 < 1)); // true || false = true 둘중 하나라도 true면 true
        System.out.println((5 < 3) || (3 < 1)); // false || false 하나라도 true 면 true / 둘다 false기 때문에 false

        // System.out.println(1<3<5); 불가능 ㄷㄷ 3개가 안되는구나 true긴 하지만 불가능!


        // 논리 부정 연산자(!) => ! : NOT
        System.out.println("!-------------------------------");
        System.out.println(!flag1); // true 였음 !는 뒤집는거기 때문에 false 예상
        System.out.println(!flag3); // false 였음 !는 뒤집는거기 때문에 true 예상
        System.out.println(!(5 == 5)); // 맞지만 ture지만 뒤집기때문에 false 예상
        System.out.println(!(5 == 3)); // 틀린거기 때문에 뒤집어서 true




    }
}