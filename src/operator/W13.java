package operator;

import java.util.Objects;
import java.util.Scanner;

public class W13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // A에게 값 입력받기 스캐너 넣었음 ㅇㅇ 아래는 확인해보자
        System.out.println("A 입력 : ");
        String aHand = sc.nextLine();

        // B에게 값 입력받기 스캐너 넣었음 ㅇㅇ 아래는 확인해보자
        System.out.println("B 입력 : ");
        String bHand = sc.nextLine();

        // 두 개의 값을 비교하는 메서드 -> Objects.equals (좌,우) 가 같은경우 true, 다를경우 false
        // 가위바위보 만들때 쓰면 되겠네
        if (Objects.equals(aHand, "가위")) {
            if (Objects.equals(bHand, "가위")) {
                System.out.println("A와 B는 비겼습니다");
            } else if (Objects.equals(bHand,"바위")) {
                System.out.println("B가 이겼습니다");
            } else if (Objects.equals(bHand,"보")) {
                System.out.println("A가 이겼습니다");
            } else {
                System.out.println("B가 이상한 값을 입력했습니다.");
            }
        } else if (Objects.equals(aHand,"바위")) {
            if (Objects.equals(bHand, "가위")) {
                System.out.println("A가 이겼습니다");
            } else if (Objects.equals(bHand,"바위")) {
                System.out.println("A와 B는 비겼습니다");
            } else if (Objects.equals(bHand,"보")) {
                System.out.println("B가 이겼습니다");
            } else {
                System.out.println("B가 이상한 값을 입력했습니다.");
            }
        } else if (Objects.equals(aHand, "보")) {
            if (Objects.equals(bHand, "가위")) {
                System.out.println("B가 이겼습니다");
            } else if (Objects.equals(bHand,"바위")) {
                System.out.println("A가 이겼습니다");
            } else if (Objects.equals(bHand,"보")) {
                System.out.println("A와 B는 비겼습니다");
            } else {
                System.out.println("B가 이상한 값을 입력했습니다.");
            }
        } else {
            System.out.println("A가 이상한 값을 입력했습니다.");
        }
    }
}
