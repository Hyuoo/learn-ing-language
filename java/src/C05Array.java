/** Array
 * 배열을 선언할 땐 자료형에 []를 붙여준다.
 */

public class C05Array {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4, 5};
        // int ar[] = {1,2,3};  // Bad Style.
        String[] languages = {"Java", "Python", "Scala", "Go"};

            // 초기화를 하던가, 길이를 명시하던가.
        // init empty array
        String[] box = new String[3];
        box[0] = "ABC";
        box[1] = "DEF";
        box[2] = "ATK";

        System.out.println(nums[1]);  // 2
        System.out.println(languages[2]);  // "Scala"
        System.out.println(box[1]);  // "DEF"

        /* length */
        System.out.println(nums.length);  // 5
        // ! 문자열은 String.length()였지만, 배열은 멤버변수.
        for (int i = 0; i < languages.length; i++) {
            System.out.println(languages[i]);
        }
    }
}
