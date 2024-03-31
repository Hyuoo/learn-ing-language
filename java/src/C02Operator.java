/**
 * 연산자에 대해서 파이썬과 다른 부분 위주로 간략하게.
 * - 자바 문자열 비교는 메서드 String.equals(:str)를 통해서 함.
 * - 파이썬의 거듭제곱연산(**)이 자바에는 없음.
 *      -> Math.pow(a, b) :return double:
 * - 파이썬의 몫 연산(//)이 자바에는 없음.
 *      -> 나누기 자체가 넓은 타입으로 자동 캐스팅으로 연산 됨.
 * - 자바에는 unsigned right shift operator (>>>)가 있다.
 */

public class C02Operator {
    public static void main(String[] args) {

        int a = 0;
        /* 단항 증감연산자가 있음. */
        System.out.println(a++);  // 0
        System.out.println(++a);  // 2
        System.out.println(--a);  // 1

        System.out.println();

        /* 실수 연산 타입캐스팅 */
        System.out.println(10/3);  // 3
        System.out.println(10.0/3);  // 3.333333
        System.out.println(10/3.0);  // 3.333333

        System.out.println();

        /* >>> 연산자 */
        // 일반적으로 시프트 연산을 하게 되면, sign비트는 그대로 유지가 된다.
        // 양수에서는 동일하지만, 음수일 경우 sign비트가 1에서 0으로 채워지며 시프트된다.
        System.out.println(-1>>>1);  // 2147483136  // 1111... -> 0111...로 최댓값
        System.out.println(-1>>1);  // -1

        System.out.println();

    }
}
