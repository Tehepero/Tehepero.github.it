package operator;

public class W08 {
    public static void main(String[] args) {
        // 연산자의 우선순위
        int x = 2;
        int y = 9;
        int z = 10;

        boolean result = x < y && y < z; // x가 더작고 y가 더작으니 둘다 true임 and 그리고 이기 때문에 둘다맞으니 true
        System.out.println(result);
        System.out.println("-위가 true면 정답-");

        result = x + 10 < y && y < z; // false and xx 벌써부터 하나가 false 9가 10보다 작은 뒤는 true
        // 12 < 9 부터 틀렸기 때문에 and 라서 하나가 false라 false일거임
        System.out.println(result);
        System.out.println("-위가 false면 정답-");


        result = x + 2 * 3 > y; // 순서 조심 헷갈릴수도있음 곱하기먼저임 6 + 2 는 8 > 9 틀렸으니까
        System.out.println(result);
        System.out.println("-위가 false면 정답-");

        result = (x +2) * 3 > y; // true 괄호면 무조건 괄호우선 12 > 9 트루다
        System.out.println(result);
        System.out.println("-위가 true면 정답-");


    }
}
