package Wordgame;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Collections;

public class BaseballGame {
    private int size =3;
    private String inputValue;
    private String answer; //
    private List<Character> availableChars = List.of('1', '2', '3', '4', '5', '6', '7', '8', '9');
    // 해설 영상을 보며 만들었습니다 찬찬히 뜯어보며 공부하겠습니다
    // 정답 숫자 생성 - generateRandomWithShuffle()
    // 숫자 입력 - Scanner
    // 게임 로직 적용 - play() -> Strike 판별, Ball 판별
    // 결과값 출력 - System.out.println()

    // 게임 이어서 하기 - while()

    public BaseballGame() {
        // 정답 숫자 생성 -generateRandomWithShuffle() -> 객체 생성시 수행
        this.answer = generateRandomWithShuffle();
    }

    public void play() {
        System.out.println("< 게임을 시작합니다>");
        while(true) {
            // 숫자입력 - Scanner
            Scanner sc = new Scanner(System.in);
            this.inputValue = sc.nextLine(); // 스트링입니다 컨트롤 + 왼쪽클릭하면 상세설명? 리턴값 알수있음 일단 스트링입니다!
            // 원래 String.inputValue 였으나 6번코드 추가후 this 로 바꿀수 있었습니다 <= 공부할것
            // 입력받은 값을 변수에 할당한다

            int strikeCount = countStrike(this.inputValue, answer);

            if (strikeCount == this.size) {
                System.out.println(strikeCount + "스트라이크! 정답입니다.");
            }
            // 카운트스트라이크가 정의되지 않았기 때문에 만들면 됨 6번줄
            //answer 도 정의(만들면) 됨 7번줄

            // 입력받은 값을 변수에 할당한다

            // 입력된 값에 스트라이크가 몇개인지 판별한다.
            // 만약 if 스트라이크가 3개면 '정답!' :

            // 입력된 값에 볼이 몇개인지 판별한다.
            int ballCount = countBall(this.inputValue, this.answer);

            if (strikeCount == 0 && ballCount == 0) {
                System.out.println("아웃!");
            } else {
                System.out.println("스트라이크 : " + strikeCount + " / " + "볼 : " + ballCount);
            }
        }
        // 스트라이크와 볼이 모두 0개면 '아웃!'
        // 스트라이크와 볼 개수를 가지고 힌트를 출력
    }

    private int countStrike(String inputValue, String answer) {
        int count = 0;

        for (int i = 0; i < inputValue.length(); i++) { //스트링의 길이만큼 돌거고 3일거니까 0,1,2
            // inputValue N번째 자리 숫자와 answer N번째 자리 숫자가 같으면~ -> 조건
            // count를 하나 늘려라

            if (inputValue.charAt(i) == answer.charAt(i)) {
                count++;
            }
        }

        return 0;
    }

    private int countBall(String inputValue, String answer) {
        // 자리수는 다르지만 => 다르다 and 정답에 포함된 숫자라면 -> 조건
        // count++;
        int count = 0;

        for (int i = 0; i < inputValue.length(); i++) {

            if (inputValue.charAt(i) != answer.charAt(i)
                    && answer.contains(Character.toString(inputValue.charAt(i)))) {
                count++;
            }
        }

        return count;
    }
    //카운트볼도 없으므로 만들어줍니다 41번줄

    private String generateRandomWithShuffle() {
        List<Character> targets = new ArrayList<>(availableChars);

        Collections.shuffle(targets);

        StringBuilder result = new StringBuilder();
        for (int i = 0; i < this.size; i++) {
            result.append(targets.get(i));
        }

        return result.toString();
    }

}
