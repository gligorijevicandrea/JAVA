package class29;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
public class Replit206 {



        public static void main(String[] args) {

            HashMap<String, String> map = new HashMap<>();
            map.put("ONE", "AAA");
            map.put("TWO", "BBB");
            map.put("THREE", "CCC");
            map.put("FOUR", "DDD");
            map.put("FIVE", "EEE");

            System.out.println("HashMap Before Remove :");

            Set<Map.Entry<String, String>> entrySet = map.entrySet();

            for (Map.Entry<String, String> entry : entrySet) {
                System.out.println(entry.getKey() + " : " + entry.getValue());
            }

            map.remove("ONE");
            map.remove("FOUR");

            System.out.println("------------------");
            System.out.println("HashMap After Remove :");

            for(Map.Entry<String,String> entry:entrySet){
                System.out.println(entry.getKey()+" : "+entry.getValue());
            }



        }
    }

