/** ArrayList
 * 가변 길이의 배열.
 * 일반적으로 ArrayList를 사용하는데, Vector, LinkedList 등이 있다.
 *
 * - Method
 *      - add
 *      - get
 *      - size
 *      - contains
 *      - remove
 * - array -> list
 * - sort
 */
import java.util.ArrayList;
import java.util.Arrays;  // 배열로부터 List를 만들기 위한
import java.util.Comparator;  // sort key

public class C06List {
    public static void main(String[] args) {
        ArrayList nums = new ArrayList();
        nums.add(10);
        nums.add("ABC");
        nums.add(1, 30);  // 인덱스 위치에 삽입

        // nums[1]과 같은 인덱스접근 불가
        System.out.println(nums.get(2));

        /* generic을 통해서 자료형을 명시하는게 좋음 */
        ArrayList<String> names = new ArrayList<String>();
        // names.add(123);  // 제네릭타입에 맞는 변수만 넣을 수 있음.
        names.add("steve");
        names.add("eleven");
        names.add("ryu");

        // ArrayList는 그대로 문자열로 출력 가능
        System.out.println(names);  // [steve, eleven, ryu]

        // 리스트 길이는 length가 아닌 size
        System.out.println("size: " + names.size());  // size: 3

        // contains
        System.out.println(names.contains("ryu"));  // true

        /* remove */
        // index를 통해서 remove하면 return은 해당 obj
        System.out.println(names.remove(1));  // eleven
        // obj를 통해서 remove하면 return은 boolean
        System.out.println(names.remove("steve"));  // true

        System.out.println("size: " + names.size());  // size: 1


        System.out.println();


        /* Array to List */
        String[] data = {"def ", "foo", "()", ":"};
        ArrayList<String> fromArray1 = new ArrayList<>(Arrays.asList(data));
        ArrayList<String> fromArray2 = new ArrayList<>(Arrays.asList("B", "C", "A"));
        ArrayList<Integer> fromArray3 = new ArrayList<>(Arrays.asList(4,2,3));

        System.out.println(fromArray1);  // [def , foo, (), :]
        System.out.println(fromArray2);  // [B, C, A]
        System.out.println(fromArray3);  // [4, 2, 3]


        System.out.println();


        /* Sort */
        fromArray2.sort(Comparator.naturalOrder());  // asc
        System.out.println(fromArray2);  // [A, B, C]
        fromArray3.sort(Comparator.reverseOrder());  // desc
        System.out.println(fromArray3);  // [4, 3, 2]

    }
}
