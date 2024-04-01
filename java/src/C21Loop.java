/** for, while (Loop)
 *
 */

public class C21Loop {
    public static void main(String[] args) {

        for (int i=0; i<3; i++) {
            continue;
        }

        int[] nums = {10, 20, 30, 40};
        for (int num : nums) {
            System.out.println(num);
        }

        int count = 0;
        while (count < 10) {
            if (count % 3 == 0) {
                count++;
                continue;
            }
            System.out.printf("%d ", count++);
        }  // 1 2 4 5 7 8
    }
}
