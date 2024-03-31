/** String, string method
 * 자바에서 문자열 다루기
 * 자바에서 문자열은 String이라는 객체로 생성된다.
 * 간단한 문자열 연산 몇가지를 보고 가자.
 *
 * - 비교연산은 ==이 아닌, equals메서드로.
 *
 * - .length() -> int
 * - .indexOf(int|char|str) -> int
 * - .contains(str) -> bool
 * - .charAt(int) -> char
 *
 * - .replace(old, new) -> str
 * - .replaceAll(regex, new) -> str
 * - .substring(start[, end]) -> str
 * - .toUpperCase() -> str
 * - .toLowerCase() -> str
 * - .split(regex) -> Array
 *
 * - String.format(str, args) -> str
 * - .formatted(args) -> str
 *
 * - String.join(delimiter, array) -> str
 */
import java.util.ArrayList;
import java.util.Arrays;    // split한 배열을 문자열로 출력하기 위함

public class C03String {
    public static void main(String[] args) {
        /* init */
        String a = "Hello";  // recommend (literal)
        String b = new String("Hi JAVaaaAa");  // redundant

        System.out.println("is string object");
        System.out.println(a);
        System.out.println(b);

        System.out.println();

        /* equals() */
        String origin = "Bubble";
        System.out.println(origin.equals("bubble"));  // false
        // 문자열을 == 연산자를 통해서 비교하면 객체를 비교한다.
        System.out.println(origin == "Bubble");  // 여기는 리터럴이라서 true
        // origin이 new String()을 통해서 만들어 졌거나, 다른 문자열이 다른 객체로 만들어질 경우 false
        System.out.println(origin == new String("Bubble"));  // false

        System.out.println();


        String doc = "Hello java_";

        /* length */
        System.out.println(doc.length());  // 11

        /* indexOf() */
        System.out.println(doc.indexOf(97));  // 7; int는 ascii
        System.out.println(doc.indexOf('j'));  // 6
        System.out.println(doc.indexOf("llo"));  // 2

        /* contains() */
        System.out.println(doc.contains("java"));  // true
        System.out.println(doc.contains("python"));  // false

        /* charAt() */
        System.out.println(doc.charAt(6));  // j
        // System.out.println(doc[6]);  // String[index] 안됨.


        System.out.println();


        /* replace(), replaceAll() */
        System.out.println(doc.replace("java", "python"));  // "Hello python_"
        // 모든 일치하는 단어를 치환 함.
        System.out.println(doc.replace("a", "*"));  // "Hello j*v*_"
        // replaceAll은 regexp를 통해서 치환
        System.out.println(doc.replaceAll("H.+o", "*"));  // "* java_"

        /* substring() */
        // 1개는 [a:], 2개는 [a:b]
        System.out.println(doc.substring(7));  // "ava_"
        System.out.println(doc.substring(1, 5));  // "ello"

        /* toUpperCase(), toLowerCase() */
        System.out.println(doc.toUpperCase());  // "HELLO JAVA_"
        System.out.println(doc.toLowerCase());  // "hello java_"

        /* split() */
        String[] result = doc.split("a");
        System.out.println(Arrays.toString(result));  // {"Hello j", "v", "_"}
        System.out.println(Arrays.toString(doc.split("l")));  // {"He", , "o java_"}


        System.out.println();


        /* formatting */
        String formattedString = "is repeat %d count. (%s)";
        for (int i=0; i<3; i++) {
            System.out.println(String.format(formattedString, i, "format"));
            System.out.println(formattedString.formatted(i, "formatted"));
        }
        /*
        %d: integer
        %f: floating-point
        %o: octal
        %x: hex
        %c: character
        %s: string
        %%: '%'
        */
        // 자바는 %s에 문자열이 아니어도 문자열로 캐스팅된다.
        System.out.println(String.format("[%s, %s, %s]", 100, 3.14, 0x31));  // "[100, 3.14, 49]"

        // 다른 포맷팅 문자열은 동일..
        System.out.printf("[%-10s]%.4f[%05d]\n", 'L', 0.1, 11);  // "[L         ]0.1000[00011]"


        /* String.join() */
        String[] splitWord = {"AB", "CD", "EF"};
        System.out.println(String.join("-", splitWord));  // AB-CD-EF
        System.out.println(String.join("", "hello", "world"));  // helloworld

        // 이후 배울 ArrayList도 가능
        ArrayList<String> tmpArrayList = new ArrayList<>(Arrays.asList("123", "456", "789"));
        System.out.println(String.join("!", tmpArrayList));  // 123!456!789
    }
}
