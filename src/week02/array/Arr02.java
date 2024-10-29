package week02.array;

import java.util.Arrays;

public class Arr02 {
    public static void main(String[] args) {
        // 초기화 해봅시당

//        // 1. 배열에 특정한 대입해서 선언
//        int[] intArr = {10, 20, 30, 40, 50}; // 원래 new int 어쩌구였는대 이번엔 직접 초기값을 넣은듯
//        String[] stringArray = {"a", "b", "c", "d"};
//
//        //2. for문을 통해서 대입
//        for(int i=0; i<intArr.length; i++) {
//            intArr[i] = i;
//        }
//
//        System.out.println("-------------");
////        // 다건출력
////        for(int i=0; i<intArr.length; i++) {
////            System.out.println(intArr[i]);
////        }
//        for (int item: intArr) {
//            System.out.println(item );
//        }

        // 배열의 주소를 모두 같은 값으로 초기화
        int[] intArr = {10, 20, 30, 40 ,50};

        Arrays.fill(intArr, 1);

        for (int item: intArr) {
            System.out.println(item);
        }


    }
}
