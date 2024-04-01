/** if, switch (statement)
 * java의 boolean literal은 모두 소문자. true, false
 *
 *
 * ** enhanced switch **
 * 아래 예제처럼 switch 결과로 어떤 값을 리턴하기만 한다면 대체 가능.
 *  var = switch (argument) {
 *      case 1 -> ret;
 *      case 2 -> ret;
 *      case 3, 4, 5 -> ret;
 *      default -> ret;
 *  };
 */
public class C20IfSwtich {
    public static void main(String[] args) {
        boolean flag = true;
        boolean flag2 = false;

        if (flag) {
            System.out.println("참임");
        } else if (flag2) {
            System.out.println("머임");
        } else {
            System.out.println("뻥임");
        }

        // 비교연산의 반환값들이 boolean.
        System.out.printf("%s, %s, %s\n", 1>3, 1!=5, 10==10.0);  // false, true, true
        // 10이랑 10.0이 같네

        // System.out.println(10 && true);  // 무조건 boolean만.
        System.out.println(!false);  // true

        /* switch */
        String tmp = "";
        for (int i = 0; i < 7; i++) {
            switch (i) {
                case 1:
                    tmp = "case1";
                    break;
                case 2:
                    tmp = "case2";
                    break;
                case 3:
                case 4:
                case 5:
                    tmp = "case345";
                    break;
                default:
                    tmp = "NO CASE";
            }
            System.out.println(Integer.toString(i) + ": " + tmp);
            /* 이런 표현이 가능하다.
            tmp = switch (i) {
                case 1 -> "case1";
                case 2 -> "case2";
                case 3, 4, 5 -> "case345";
                default -> "NO CASE";
            };
             */
        }

        int preced;
        String op = "+";
        // switch를 매핑처럼 사용하는 경우
        preced = switch (op) {
            case "(" -> 0;
            case "*", "/" -> 3;
            case "+", "-" -> 5;
            default -> -1;
        };
        System.out.println(preced);
    }
}
