/** 자바 코드 기본구조 (HELLLOOOOOOOOOOOO)
 * 파일 당 하나의 class로 구성되며(google style)
 * class 내부에 여러 메서드로 구성된다.
 */

/* (public|default) class 클래스명 */
public class C00HelloWorld {
    // 클래스 명은 소스파일명과 동일하게.
    public static String msg = "Hello, World";

    /* (public|protected|default|private) [static] (returnType) 메서드명 (inputType arg)*/
    public static void main(String[] args) {
        // main 메서드가 프로그램 메인.
        // "C00HelloWorld 클래스"를 실행시킨다는 느낌
        String negative = "안";

        System.out.print(negative + "헬로,, ");
        System.out.println(msg + "\nEND..");
        // 안헬로,, Hello, World
        // END..
    }


}
