package typeOfVariable;

/**
 * 변수의 타입: 기본형 / 참조형
 * 기본형(primitive): boolean, byte, short, int, long, char, float, double => 8개 고정
 * 참조형(reference): String, System ... => 사용자가 생성 가능하므로 고정적이지 않음. 개수가 정해지지 않음.
 *
 * -----
 * 기본형: 정수형 / 실수형
 * 크기 (byte)
 *  - 논리형: boolean(1, true / false) 타입만 존재, true, false 밖에 존재하지 않아서 1 bit로 표현 가능하지만, 자바의 데이터 최소 단위는 byte 이므로 1byte zmrlfmf rkwl
 *  - 문자형: char(2), 2byte 문자체계인 유니코드를 사용하기 때문에 2byte 크기를 가짐
 *  - 정수형: byte(1), short(2), int(4, default), long(8)
 *  - 실수형: float(4), double(8byte, default, float 보다 2배 높은 정밀도)
 *
 * ----------
 * 기본형의 표현 범위
 * n 비트의 크기를 가진 타입
 * 부호가 없는 정수형: 0 ~ 2^n - 1 까지 표
 * 부호가 있는 정수형: -2^(n-1) ~ 2^(n-1) - 1 까지 표
 *
 * 실수의 표현 범위
 * float: 1.4E-45 ~ 3.4E38
 *  - 정수형과 달리 부호, 지수, 가수로 나뉜 표현 방식을 통해서 더 넓은 범위를 값을 표현할 수 있음.
 */
public class TypeOfVariable {

    /**
     * char: 2byte == 16bit => 0 ~ 2^16 - 1 == 65535 까지 표현(char의 경우는 음수를 표현할 필요가 없음)
     */
    char a = 'A'; // 65 == 0000 0000 0100 0001(2진수)로 표현

    /**
     * 실수형의 오차 범위
     * 실수형의 표현 방식: 부호 + 지수 + 가수로 표현
     * float(32 bit):
     *  - 부호S(1) + 지수E(8) + 가수M(23)
     *  - 정밀도: 7자리 (소숫점 7자리까지는 값을 보장함, 그 이 후는 값이 보장안됨)
     *  - 10^7 < 2^24 (정규화로 24자리까지 표현) < 10^8 => 소숫점 7자리까지 표현 가능함
     *
     *  double(64 bit):
     *  - 부호S(1) + 지수E(11) + 가수M(52)
     *  - 정밀도: 15자리
     */
}
