/** StringBuffer
 * 스트링 버퍼는 문자열을 추가하거나 변경할 때 사용 함.
 *
 * - String을 사용해도 동일한 동작을 할 수 있지만, immutable이다.
 * - StringBuilder라는 것도 있다.
 */

public class C04StringBuffer {
    public static void main(String[] args) {
        StringBuffer sb = new StringBuffer();
        String s = new String("original String.");

//        System.out.println(s);
//        s += "zxcv";
//        System.out.println(s);
        // 어 근데 그냥 스트링도 되는데..?

        /* append() */
        sb.append("start");
        System.out.println(sb);  // "start"
        sb.append(" mid.");
        sb.append("asdf?");

        String result = sb.toString();
        System.out.println(result);  // "start mid.asdf?"

        /*
        String, StringBuffer 모두 문자열을 추가하는 결과는 같지만
        객체 생성과 메모리 측면에서 차이가 있다.
        - String 연산은 새로운 문자열을 붙여 만들 때 마다 새로운 String 객체가 생성 됨.
        - StringBuffer는 객체가 한번만 생성 됨.

        즉 String은 immutable, StringBuffer는 mutable.
         */

        /* insert() */
        sb.insert(1, "끼어들기");
        System.out.println(sb.toString());  // "s끼어들기tart mid.asdf?"

        /* substring() */
        System.out.println(sb.substring(1, 5));  // "끼어들기"
        System.out.println(sb.toString());  // 원본은 그대로

        /* delete() */
        sb.delete(0, 10);
        System.out.println(sb.toString());  // "mid.asdf?"



        /* StringBuilder */
        StringBuilder sbd = new StringBuilder();
        sbd.append("is");
        sbd.append("String");
        sbd.append("Builder");
        System.out.println(sbd.toString());  // "asdfzxcv"
        // 사용법은 StringBuffer와 동일하다.
        // StringBuffer는 멀티 스레드에서 안전하고
        // StringBuilder는 성능이 더 좋다. 동기화를 고려 할 필요가 없는 경우 빌더가 유리.
    }
}
