package operator;

public class W06 {
    public static void main(String[] args) {
        // 대입연산자에서 주의해야 할 점!!
        // ++, --
        int a = 10;
        int b = 10;
        int val = ++a + --b; // a = 11 / b = 9 / = 20 ++는 +1 이고 --는 -1이니까
        System.out.println(a);
        System.out.println(b);
        System.out.println(val); // 21 --가 뒤에있으면 그후에 적용?됨
    }
}
