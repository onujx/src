import java.util.*;
import java.util.Map.Entry;

public class test1 {

   public static void main(String[] args) {
      
      Map<String,Integer> map=new HashMap<String,Integer>();
      
      map.put("ÇÏ³ª", 85);
      map.put("µÑ", 90);
      map.put("¼Â", 80);
      map.put("³İ", 75);
      map.put("´Ù¼¸", 95);
      
      map.put("µÎ¹øÂ°", 100);
      
      System.out.println("ÃÑ ¼ö : " + map.size());
      
      System.out.println("/t¼Â : " + map.get("¼Â"));
      System.out.println();
      
      Set<String> keySet = map.keySet();
      Iterator<String> keyIterator = keySet.iterator();
      while(keyIterator.hasNext()) {
         String key = keyIterator.next();
         Integer value = map.get(key);
         System.out.println("/t"+key+":"+ value);
      }
      System.out.println();
      
      map.remove("µÑ");
      System.out.println("ÃÑ °¹¼ö : "+map.size());
      
      Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
      Iterator<Map.Entry<String, Integer>> entryIterator = entrySet.iterator();
      
      while(entryIterator.hasNext()) {
         Entry<String, Integer> entry = entryIterator.next();
         String key = entry.getKey();
         Integer value = entry.getValue();
         System.out.println("/t"+key+":"+value);
      }
      System.out.println();
      
      map.clear();
      System.out.println("ÃÑ °¹¼ö : " +map.size());
   }
}
