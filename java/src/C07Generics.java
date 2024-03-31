/** Generic Type
 * (https://docs.oracle.com/javase/tutorial/java/generics/types.html)
 *
 * 자료형을 명시하여, 캐스팅 오류를 방지한다.
 *
 * **Type Parameter Naming Convention**
 * - E: Element
 * - K: Key
 * - N: Number
 * - T: Type
 * - V: Value
 * - S, U, V etc..: 2nd, 3rd, 4th types
 */
import java.util.ArrayList;

public class C07Generics {
    public static void main(String[] args) {
        ArrayList z = new ArrayList();  // 타입 명시 없이도 에러는 없음.
        ArrayList<String> a = new ArrayList<String>();
        ArrayList<Integer> b = new ArrayList<>();  // 객체생성에선 명시하지 않아도 된다.

        z.add("123");
        String tmp = (String) z.get(0);  // 명시적 캐스팅을 해 줘야 한다. 안하면 에러.

        a.add("456");
        String tmp_ = a.get(0);

    }
}
