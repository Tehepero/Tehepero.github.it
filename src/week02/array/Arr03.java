package week02.array;

public class Arr03 {

    public static void main(String[] args) {
        // 얕은 복사
        int[] a = { 1, 2, 3, 4,};
        int[] b = a; // 얕은 복사

        b[0] = 3; // b 배열의 0번째 순번값을 3으로 수정했음 (1 -> 3)

        System.out.println(a[0]); // 출력 3 <- b배열을 바꿨지만 a의 0번째도 3으로 바뀜 근대 이게 얕은복사? ㄷㄷ 헷갈림

    }
}
