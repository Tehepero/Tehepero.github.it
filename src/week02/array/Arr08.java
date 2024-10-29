package week02.array;

public class Arr08 {
    public static void main(String[] args) {
        // 최대값 구하기
        int[] arr = {3, 2, 0, 5, 1};

        // 우리는 눈으로 보면 알지만 컴퓨터는 어떻게 구할지
        int max = arr[0];

        // 최대값 구하기 로직
        for (int num: arr) {
            if (num > max) {
                max = num;
            }
        }

        System.out.println("최대값은 => " + max);

        // 그럼 반대로 최솟값 구하기
        int min = arr[0];

        for (int num: arr) {
            if (num < min) {
                min = num;
            }
        }
        System.out.println("최소값은 => " + min);
    }
}
