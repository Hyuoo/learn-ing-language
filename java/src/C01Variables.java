/** 변수와 자료형 (variables & data type)
 * 자바는 강한 타입 언어.
 * int, float, long, true, false 등 외에는 모두 객체로 이루어져 있으며,
 * 객체가 아닌 위 변수들은 원시 자료형이라고 한다.
 *
 * - 변수를 포함해서 클래스나 메서드에 붙는 이름을
 *      자바에서는 식별자(identifier)라고 한다.
 * - 식별자 네이밍 규칙
 *      - 문자, 숫자, $, _만 사용 가능. (*정규표현식 \w+에 성립.)
 *      - (근데 자바는 변수명에 언더바를 안씀)
 */

public class C01Variables {
    public static void main(String[] args) {
        /* Type varName; 형태로 변수 선언 */
        int varName;
        String var2IsStr1ng;
        int canUse_$;

        // 타입 에러는 이런 느낌
        // java: incompatible types: java.lang.String cannot be converted to int
        // java: incompatible types: int cannot be converted to java.lang.String

        byte varByte;
        short varShort;
        int varInt;
        long varLong;
        float varFloat;
        double varDouble;
        boolean varBoolean;
        char varChar;
        String varString;

        varByte = 97;
        varShort = 32236;
        System.out.println(varByte);
        System.out.println(varShort);

        varInt = Integer.MAX_VALUE;
        System.out.printf("Integer range: (%d ~ %d)\n", varInt+1, varInt);
        // Integer range: (-2147483648 ~ 2147483647)

        varLong = 9223372036854775807L;  // long 타입 수에는 L을 붙여줘야 함. (INT_MAX 보다 큰 값)
        System.out.println("Long range: ("+Long.toString(varLong+1)+" ~ "+Long.toString(varLong)+")");
        // Long range: (-9223372036854775808 ~ 9223372036854775807)

        /*
        float : -3.4 * 10^38  ~ 3.4 * 10^38
        double: -1.7 * 10^308 ~ 1.7 * 10^308
        */
        varFloat = 3.141592F;  // float 타입은 F를 붙여줘야 함.
        varDouble = Double.MAX_VALUE;
        System.out.format("FLOAT: %f\nDOUBLE_MAX: %f\n", varFloat, varDouble);
        // FLOAT: 3.141592
        // DOUBLE_MAX: 179769313486231570000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000000.000000

        /* Real number can also be expressed an exponential */
        System.out.printf("Exp-exp: %f, %f\n", 1.234e2, 1e9);
        // 123400.000000, 1000000000.000000

        /* Base */
        int octal = 023;
        int hex = 0xF;
        System.out.println(octal);
        System.out.println(hex);
    }
}
