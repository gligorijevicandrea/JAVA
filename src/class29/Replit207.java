package class29;
import java.util.*;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Set;
import java.util.Iterator;

public class Replit207 {


        public static void main(String[] args) {

            HashMap<String, String> map = new HashMap<>();
            map.put("ONE", "AAA");
            map.put("TWO", "BBB");
            map.put("THREE", "CCC");
            map.put("FOUR", "DDD");
            map.put("FIVE", "EEE");

            System.out.println("HashMap Before Replace :");

            Set<Entry<String, String>> entrySet=map.entrySet();

            Iterator<Entry<String, String>>entryIterator=entrySet.iterator();

            while(entryIterator.hasNext()) {
                Entry<String, String> ent=entryIterator.next();
                String entry=ent.getKey()+" : "+ent.getValue();
                System.out.println(entry);
            }
            System.out.println("------------------");
            System.out.println("HashMap After Replace :");


            map.replace("FIVE","EEE","SUMAIR");
            map.replace("THREE","CCC","ASEL");




            Iterator<Entry<String, String>>entryIterator2=entrySet.iterator();

            while(entryIterator2.hasNext()) {
                Entry<String, String> ent=entryIterator2.next();
                String entry2=ent.getKey()+" : "+ent.getValue();
                System.out.println(entry2);
            }




        }
    }

