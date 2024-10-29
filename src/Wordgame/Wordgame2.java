package Wordgame;

import java.util.Scanner; // 입력을 위한 스캐너 생성
import java.util.Random;

public class Wordgame2 {
    public static void main(String[] args) {

        Random r = new Random(); // 랜덤값을 추출하는 함수
        Scanner sc = new Scanner(System.in);

        int[]com = new int[3]; // 컴퓨터의 숫자가 저장될 배열 생성

        // int[] com에 1~9까지의 수를 랜덤으로 생성 저장
        for(int i = 0; i < com.length; i++) {
            com[i] = r.nextInt(9)+1;
            // 처음은 0, 1, 2 ///
        }

        while(true) {
            if(com[0] != com[1]){ //com[0] 과 com[1] 의 값이 서로 중복되지 않을 때
                if(com[0] != com[2] && com[1] != com[2]){
                    break;
                } else {

                }
            }
        }









    }
}
