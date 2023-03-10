package class29;
import java.util.HashMap;
import java.util.Set;
import java.util.Map;
import java.util.Iterator;
public class Replit205 {



        public static void main(String[] args) {

            HashMap<String,String> maps=new HashMap<>();

            maps.put("Street","Patrick ST");
            maps.put("Suite","265");
            maps.put("City","Vienna");
            maps.put("Zip","22180");
            maps.put("Country","United States");


            Set<Map.Entry<String,String>> entrySet=maps.entrySet();

            Iterator<Map.Entry<String,String>> entryIterator=entrySet.iterator();

            while(entryIterator.hasNext()){
                Map.Entry<String,String> ent=entryIterator.next();
                System.out.println(ent.getValue().toUpperCase());
            }



        }
    }

