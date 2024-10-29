package week02.array;

public class Arr05 {
    public static void main(String[] args) {
        // 문자, 문자열 구분했던것 1주차부터 ㅇㅇ 문자(char) 기본형 변수 문자열(String) 참조형 변수
        // String = char[]

        // 기본형 변수 vs 참조형 변수의 차이 정리
        // 1. 기본형 변수는 '소문자로 시작함' 반면 참조형 변수는 '대문자로 시작함'
        // - Wrapper class 에서 기본형 변수를 감싸줄 때 (boxing), int -> Integer
        // 2. 기본형 변수는 값 자체를 저장, 참조형 변수는 별도에 공간에 값을 저장 후 그 주소를 저장함 (= 주소형 변수)

        // char < String (훨씬 더!)
        // String이 가지고 있는 기능이 훨씬 많아서 String을 훨씬 많이 쓴다고 함
        // Wrapper class와도 상당히 비슷..! -> 기본형 변수가 가지고있는 기능이 적음 => 래퍼로 감싸면서 추가기능을 더함

        // String 기능 활용 예시
        String str = "ABCD";

        // (1) length
        int strLength = str.length();
        System.out.println(strLength);

        // (2) charAt(int index)
        char strChar = str.charAt(1);
        System.out.println(strChar);

        // (3) substring(int fromIdx, int toIdx)
        String strSub = str.substring(0, 3);
        System.out.println(strSub);

        // (4) equals(String str)
        String newStr = "ABCE"; // 같으면 ture 다르니까 지금은 false
        boolean strEqual = newStr.equals(str);
        System.out.println(strEqual);

        // (5) toCharArray() : String -> char[]
        char[] strCharArray = str.toCharArray();

        // (6) 반대로 char[] -> String -> CHAR
        char[] charArray = {'A', 'B', 'C'};
        String charArrayString = new String(charArray);
        System.out.println(charArrayString  );
    }
}
