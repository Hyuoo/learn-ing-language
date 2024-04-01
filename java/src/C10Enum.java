public class C10Enum {
    enum Lang {
        C,
        CPP,
        JAVA,
        PYTHON,
        RUBY,
    };

    static void someFunc(Lang name) {
        switch (name) {
            case PYTHON:
                System.out.println("print(\"hleleo, owld\")");
                break;
            case JAVA:
                System.out.println("System.out.println(\"hele, howl\");");
                break;
            case C:
                System.out.println("printf(\"%s\", \"H:elhro\");");
                break;
        }
    }

    public static void main(String[] args) {
        System.out.println(Lang.JAVA);  // JAVA

        // values()는 Lagn[] 타입으로 리턴됨.
        for (Lang l: Lang.values()) {
            System.out.println(l);
        }  // enum 선언 순서대로 나온다.

        someFunc(Lang.PYTHON);
        someFunc(Lang.C);
    }
}
