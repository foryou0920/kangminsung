
package ex1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Ex3_Map {
    public static void main(String[] args) {
        String[] msg = {"Test1","Test2","Test3"};
        HashMap<Integer,String> map = new HashMap<>();
        int size = msg.length;
        for(int i = 0 ; i<size ; i++) { 
            map.put(i,msg[i]); // 맵에저장 
        }
        System.out.println("Map의 사이즈 : " +map.size());
        //맵에서 출력
        // key값을 저장후 출력
        Set<Integer> keys = map.keySet();
        for(Integer e :keys) { 
            // 맵에서 get(key)를 사용해서 value를 획득
            System.out.println(map.get(e));
            
        }
        // Entry : 키와 값으로 객체의 순서를 쌍으로 가진 레코드
        for(Map.Entry e : map.entrySet()) { 
            System.out.println(e.getKey() + "," + e.getValue());
        }
        
    }
}
