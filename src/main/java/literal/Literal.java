package literal;


import org.w3c.dom.ls.LSOutput;

/**
 * 리터럴과 접두사, 접미사
 */
public class Literal {

    public static void main(String[] args) {
        // 리터럴의 진수 변환 표현
        int oct = 010;  // 8진수 10표현 -> 8
        int hex = 0x10;  //  16진수 10표현 -> 16

        // 자릿수 표현 _ 사용하기
        long l = 10_000_000_000L; // 10,000,000,000

        // 접미사를 이용한 리터럴 소수 표현
        float f = 3.14f;
        double d = 3.14d;

        // 리터럴 자체를 출려하기
        System.out.println(10.);
        System.out.println(.10);
    }


}
