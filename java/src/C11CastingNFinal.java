import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/** Casting, Final keyword
 *
 */
public class C11CastingNFinal {
    public static void main(String[] args) {
        String num = "10";

        // str to int
        int n = Integer.parseInt(num);
        System.out.println(n*2);

        // int to str
        String num2 = String.valueOf(n*3);
        String num3 = Integer.toString(n/2);
        String num4 = n + "";  // "" + n처럼 그냥 문자열이랑 더해주면 된다.
        System.out.println(num2 + num3 + num4);  // 30510

        // str to real
        String realNum = "123.45";
        float f = Float.parseFloat(realNum);
        double d = Double.parseDouble(realNum);

        System.out.println(f+1);  // 124.45
        System.out.println(d+10);  // 133.45

        //
        System.out.println((int) d);  // 123
        // int n2 = Integer.parseInt(realNum);  // NumberFormatException
        int n2 = (int) Double.parseDouble(realNum);


        /* final */
        // final을 사용하면 재할당 불가능.
        final int fa = 123;
        // fa = 4;  // cannot assign a value to final variable fa
        // fa += 4, fa++ 등 변경도 안됨
        
        final ArrayList<String> fb = new ArrayList<>(Arrays.asList("a", "b"));
        // fb = new ArrayList<>(Arrays.asList("z'"));  // cannot assign a value to final variable fb
        // 재할당은 안되나, add, remove 연산은 가능하다.
        fb.add("z");
        fb.remove("b'");

        // unmodifialbe List를 선언하려면
        final List<String> unmod = List.of("a", "b");
        // unmod.add("C");  // UnsupportedOperationException
    }
}
