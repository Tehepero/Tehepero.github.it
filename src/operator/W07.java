package operator;

public class W07 {
    public static void main(String[] args) {
        // 기타 연산자
        // (1) 형변환 연산자
        int intNumber = 93 + (int) 98.8;
        System.out.println(intNumber); // int로 형변환해서 0.8은 사라짐 191이나옴

        double doubleNumber = (double) 93 + 98.8; // 93.0 + 98.8로 나올것
        System.out.println(doubleNumber);
        System.out.println("---------기타연산자끝-----------");

        // (2) 삼항연산자
        // 비교연산자와 항상 함께 쓰인다.
        // 비교연산자의 결과 : true or false -> 이 결과의 값에 따라 결정되는 무언가
        // 조건 ? 참 : 거짓
        int x = 1;
        int y = 9;

        boolean b = (x == y) ? true : false; // 아니기 때문에 b는 false가 담길것
        System.out.println(b);
        System.out.println("위에 false인지 확인");
        
        // x가 y랑 다르니? 물어보는거 => 정답이니까 s = true가 되는것
        String s = (x != y) ? "정답" : "오답";
        System.out.println(s);
        System.out.println("위에 정답인지 확인");

        int max = (x > y) ? x : y; // x가 더크면 max에 x가 담길것 아니면 y
        System.out.println(max);
        System.out.println("바로위에 9가 나오는지 확인");

        int min = ( x < y) ? x : y; // x가 더 작으면 max에 x 아니면 y
        System.out.println(min);
        System.out.println("바로위에 1이 나오는지 확인");

        // (3) instance of(3주차 ->클래스. 객체)
        // 피 연산자가 조건에 명시된 클래스의 객체인지 비교하여
        // 맞으면 -> true
        // 틀리면 -> false

        // 배리굿~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~

    }
}
