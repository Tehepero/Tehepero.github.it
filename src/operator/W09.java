package operator;

public class W09 {
    public static void main(String[] args) {

        short x = 10; // 기억하자 제일 작은게 byte < short < int < long 이였음 그담 float < double 이였을거임
        int y = 20;
        int z = x + y; // 인트가 더 크니까 인트로 변환이 될거임

        long lx = 30L; // 엄청 크다 롱타입 변수니까 뒤에 L 접미사가 붙음
        long lz = z + lx; // Long 타입이 되야함 lx는 롱 타입이니까 큰걸로 맞춰짐

        float fx = x; // x는 short 이기 떄문에 당연히 float에도 포함됨
        float fy = y; // 이것도 float 안에 포함됨 y = int이기 때문 float 가 더큼
        float fz = z;

        System.out.println(lz);
        System.out.println(fx);
        System.out.println(fy);
        System.out.println(fz);
    }
}
