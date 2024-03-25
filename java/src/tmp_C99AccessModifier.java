/** Access Modifier (접근 제어자)
 * public과 같이 클래스나 메서드에 대한 액세스 권한(Accesss Level)을 설정하는 키워드이다.
 * - Class는 public, default를 사용 할 수 있다.
 * - attribute, method, constructor는 public, private, default, protected를 사용 할 수 있다.
 */

/** (public, protected, default, private)
 * - 허용범위 순서로는 public > protected > default > private
 * switch(modifier):
 *   case public:
 *     - 다른 패키지
 *     - 상속관계 아님
 *   case protected:
 *     - only 상속관계
 *   case default:
 *     - 같은 패키지
 *     - 상속관계 상관없이
 *   case private:
 *     - 같은 클래스
 */

public class tmp_C99AccessModifier {
    public static void main(String[] args) {
        System.out.println("asdf");
        String key = "asdfer";
        System.out.println(key);
    }

    private String key;
    private void setKey(String val) {
        this.key = val;
    }
    private String getKey() {
        return this.key;
    }
}
