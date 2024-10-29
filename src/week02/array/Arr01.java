package week02.array;

public class Arr01 {
    public static void main(String[] args) {
        // 배열 생성 해보자
        int[] intArray = new int[3]; // 인트의 초기값음 0이므로 0 0 0 이렇게 있을거임
        boolean[] boolArray = new boolean[3]; //{false 초기값 false false false}
        String[] stringArray = new String[3]; //{"","","",}

        // 배열 선언 먼저! -> 나중에 초기화
        int[] intArray2;
        intArray2 = new int[3]; // {0, 0, 0}

        // 생성한 배열을 '순회' -> 배열의 값을 하나씩 뽑아서 조회한다.
        // (1) 단건 조회 단건 12345중에 4 꺼낼때
        System.out.println(intArray[1]);
        System.out.println("-----------");

        // (2) 다건 조회 이게 중요하지 ㅇㅇ 맞지 순회하면서 동일한 조건의 작업을 가져올수있게
        // length : 길이를 구하는 메서드  이번건 3이랑 똑같음 즉 3
        for (int i=0; i<intArray2.length; i++) {
            System.out.println(intArray2[i]);
        }
    }
}
