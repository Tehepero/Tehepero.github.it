package Wordgame;

import java.util.Scanner; // 입력을 위한 스캐너 생성
import java.util.Random;

public class Wordgame {
    // BasballGame 게임 제작
    public static void main(String[] args) {

//        int bingGo1 = 3;
//        int bingGo2 = 6;
//        int bingGo3 = 9;
//        // 1. 정답인 3자리 수를 만든다 (랜덤이면 좋음)
        Random random = new Random();
        int Correct1 = random.nextInt(9) + 1;
        int Correct2 = random.nextInt(9) + 1;
        int Correct3 = random.nextInt(9) + 1;
        // 인터넷 검색으로 랜덤 가져와봄 0~9까지의 수를 위해 +1;

        System.out.println(Correct1 + "" + Correct2 + "" + Correct3); // 정답 코드 맨 마지막에 적여야?할것 같아요

        Scanner sc = new Scanner(System.in);
        // 입력을 받아야 하기 때문에 Scanner 준비 필요,

        System.out.print("예상되는 첫번째 숫자를 입력하세요 ");
        int firstNum = sc.nextInt();
        System.out.print("예상되는 두번째 숫자를 입력하세요 ");
        int secondNum = sc.nextInt();
        System.out.print("예상되는 세번째 숫자를 입력하세요 ");
        int thirdNum = sc.nextInt();
        // 총 숫자 3개를 입력받는다 (따로 하나씩 숫자를 받아도될거고 한번에 3개를 다 받아도 될건대 난이도가 다를거라고 예상됨)

        if (firstNum == Correct1 && secondNum == Correct2 && thirdNum == Correct3) {
            System.out.print("정답 입니다!!! ");
        } else if (firstNum == Correct1) {
            System.out.print("스트라이크 입니다 ");
        } else if (firstNum == Correct2) {
            System.out.print("볼 입니다 ");
        } else if (firstNum == Correct3) {
            System.out.print("볼 입니다 ");
        } else if (secondNum == Correct1) {
            System.out.print("볼 입니다 ");
        } else if (secondNum == Correct2) {
            System.out.print("스트라이크 입니다 ");
        } else if (secondNum == Correct3) {
            System.out.print("볼 입니다 ");
        } else if (thirdNum == Correct1) {
            System.out.print("볼 입니다 ");
        } else if (thirdNum == Correct2) {
            System.out.print("볼 입니다 ");
        } else if (thirdNum == Correct3) {
            System.out.print("스트라이크 입니다 ");
        } else {
            System.out.print("아웃 입니다 ");
        }
        // 큰 문제가 있음 
        // 일단 숫자를 한번에 3개 입력해야 편한대 너무너무 불편합니다
        // 스트라이크인지 볼인지까지는 알수있으나 몇개의 스트라이크 + 볼인지 알수가 없습니다.....
        // 정답을 알고 입력하는것이 아니고서야.. 풀수가 없습니다 몇 볼인지 몇 스트라이크인지 알수가 없어서
    }
}
