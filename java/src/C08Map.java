/** Map
 * dictionary 형태의 데이터 구조
 *  (associative array 라는 용어도 있네)
 * - HashMap, LinkedHashMap, TreeMap 등이 있다.
 *
 * - Method
 *      - put
 *      - get
 *      - containsKey
 *      - remove
 *      - size
 *      - keySet
 * - HashMap, LinkedHashMap, TreeMap
 */
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.TreeMap;


public class C08Map {
    public static void main(String[] args) {
        // 제네릭은 <key, value>를 정의
        HashMap<String, String> map = new HashMap<>();

        /* operate */
        map.put("3월은", "March");
        map.put("타조", "낙타");
        map.put("삼성", "맥북");

        System.out.println(map.get("타조"));  // 낙타
        System.out.println(map.get("낙타"));  // null  // 에러는 없음
        // ifnull 하려면 getOrDefault
        System.out.println(map.getOrDefault("낙타", "상어"));  // 상어

        System.out.println(map.containsKey("타조"));  // true
        System.out.println(map.remove("타조"));  // 낙타
        System.out.println(map.containsKey("타조"));  // false


        System.out.println();


        /* info */
        System.out.println(map.size());  // 2
        System.out.println(map.keySet());  // [3월은, 삼성]
        // keySet은 집합 자료형으로 리턴됨.
        
        // 셋을 리스트로 변환 가능
        ArrayList<String> keyList = new ArrayList<>(map.keySet());
        System.out.print(keyList + " 입니다.\n");  // [3월은, 삼성] 입니다.


        System.out.println();

        
        /*
        연산은 동일하나, key가 저장되는 순서에 차이가 있다.
        - HashMap: 지맘대로
        - LinkedHashMap: 입력된 순서대로 저장
        - TreeMap: 오름차순으로 저장
         */
        HashMap<String, String> HM = new HashMap<>();
        LinkedHashMap<String, String> LHM = new LinkedHashMap<>();
        TreeMap<String, String> TM = new TreeMap<>();

        String[] keys = {"3월", "삼성", "LG", "1월", "애플"};

        for (String tmp: keys) {
            HM.put(tmp, map.get(tmp));
            LHM.put(tmp, map.get(tmp));
            TM.put(tmp, map.get(tmp));
        }

        System.out.println(HM.keySet());  // [3월, 1월, 애플, LG, 삼성]
        System.out.println(LHM.keySet());  // [3월, 삼성, LG, 1월, 애플]
        System.out.println(TM.keySet());  // [1월, 3월, LG, 삼성, 애플]
    }
}
