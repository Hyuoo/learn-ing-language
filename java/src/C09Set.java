/** Set
 * 집합. HashSet, LinkedHashSet, TreeSet 등이 있다.
 *
 * - 집합연산
 *      - union
 *      - intersection
 *      - substract
 * - HashSet, LinkedHashSet, TreeSet
 */
import java.util.*;

public class C09Set {
    public static void main(String[] args) {
        String[] t = {"H", "e", "l", "l", "o"};
        HashSet<String> set = new HashSet<>(Arrays.asList(t));
        System.out.println(set);  // [e, H, l, o]

        set.add("A");
        System.out.println(set);  // [A, e, H, l, o]
        set.addAll(Arrays.asList("arr", "tmp"));
        System.out.println(set);  // [arr, A, e, tmp, H, l, o]
        set.remove("e");
        System.out.println(set);  // [arr, A, tmp, H, l, o]
        set.removeAll(Arrays.asList("A", "e", "H", "l", "o"));
        // 이런 표현이 더 성능이 좋다고 한다. 인텔리j가.
        // Arrays.asList("A", "e", "H", "l", "o").forEach(set::remove);
        System.out.println(set);  // [arr, tmp]


        System.out.println();


        HashSet<Integer> s1 = new HashSet<>(Arrays.asList(1,2,3,4));
        HashSet<Integer> s2 = new HashSet<>(Arrays.asList(3,4,5,6));

        HashSet<Integer> union = new HashSet<>(s1);
        union.addAll(s2);
        System.out.println("union: " + union);  // [1, 2, 3, 4, 5, 6]

        HashSet<Integer> intersection = new HashSet<>(s1);
        intersection.retainAll(s2);
        System.out.println("intersection: " + intersection);  // [3, 4]

        HashSet<Integer> substract = new HashSet<>(s1);
        substract.removeAll(s2);
        System.out.println("substract: " + substract);  // [1, 2]


        System.out.println();


        /*
        - HashSet: 지맘대로
        - LinkedHashSet: 입력한 순서대로 저장
        - TreeSet: 오름차순으로 정렬
         */
        HashSet<Integer> HS = new HashSet<>();
        TreeSet<Integer> TS = new TreeSet<>();
        LinkedHashSet<Integer> LHS = new LinkedHashSet<>();

        int[] tmp = {10, 20, 15, 5, 99};

        for (Integer tt: tmp) {
            HS.add(tt);
            TS.add(tt);
            LHS.add(tt);
        }

        System.out.println(HS);  // [99, 20, 5, 10, 15]
        System.out.println(TS);  // [5, 10, 15, 20, 99]
        System.out.println(LHS);  // [10, 20, 15, 5, 99]
    }
}
