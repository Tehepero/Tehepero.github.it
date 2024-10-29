package operator;

public class W02 {
    public static void main(String[] args) {
        System.out.println(4 + 2);
        System.out.println(4 - 2);
        System.out.println(4 * 2);
        System.out.println(4 / 2);
        System.out.println(5 / 2);
        System.out.println(2 / 4);
        System.out.println(4 % 2);
        System.out.println(5 % 2);
        System.out.println("-----------------------------");

        // 우선순위 연산
        System.out.println(2 + 2 * 2); //6
        System.out.println((2 + 2) * 2); //8

        // 변수를 이용한 연산
        int a = 20;
        int b = 10;
        int c;

        c = a + b;
        System.out.println(c); // C 는 일단 30임

        c = a - b;
        System.out.println(c); // 여기서 C 가 바뀌었음 10으로

        c= a * b;
        System.out.println(c); // 또 C가 바꾸미 200으로

        c = a / b;
        System.out.println(c); // 이번엔 C가 2로 바뀌었음

        c = a % b;
        System.out.println(c); // 나머지는 없기 때문에 0
    }
}
