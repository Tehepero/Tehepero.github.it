package operator;

public class W16 {
    public static void main(String[] args) {
//        int number = 0;
//
//        // ~하는 동안
//        while (number < 3) { //while은 조건만 바로 들어감 넘버가 3보다 작을때까지 바로 진행 number < 3 동안~~ 진행
//            number++;
//            System.out.println(number + "출력!"); 
        // 0 출력 ! 안나옴 왜? 0에서 바로 ++로 1더해서 1부터 출력이기 떄문 3까지 마찬가지
//
//        }

//        // do while do를먼저하고나서 while
//        int number = 4;
//        do {
//            // 이 로직 먼저 수행
//            System.out.println(number + "출력!");
//        }while (number < 3);
        // 4출력하고 끝일거임 do 먼저로 4 출력 뽑은뒤 while <3에 해당하지 않으므로 반복 X


//        // break 부수다
//        // 가장 가까운 블록의 for문 또는 while, switch문을 중단하는 역활
//        int number = 0;
//        while (number <3 ) {
//            number++;
//            if (number ==2) {
//                break;
//            } // 1씩 더하면서 나오겠지 1부터 나오겠네 그럼 1 나오겠네 근대 2는 BREAK라서 안나올듯
        // 맞음 1출력만 나옴 break가 나왔기 때문에 아래 명령어까지 안내려감
//            System.out.println(number + "출력!"); 
//        }

        // continue 에서 통과안하고 즉 프린트인으로 안가고 위로 다시감 신기하다
        int number = 0;
        while (number <3) {
            number++;
            if (number == 2) {
                continue;
            }
            System.out.println(number + "출력!");
            // 그럼 1 출력 과 3출력 만 나오겠네
            // 확인결과 맞다!
        }
    }
}
