import java.util.*;
import java.util.Map.Entry;

public class test1 {

   public static void main(String[] args) {
      
      Map<String,Integer> map=new HashMap<String,Integer>();
      
      map.put("�ϳ�", 85);
      map.put("��", 90);
      map.put("��", 80);
      map.put("��", 75);
      map.put("�ټ�", 95);
      
      map.put("�ι�°", 100);
      
      System.out.println("�� ���� : " + map.size());
      
      System.out.println("/t�� : " + map.get("��"));
      System.out.println();
      
      Set<String> keySet = map.keySet();
      Iterator<String> keyIterator = keySet.iterator();
      while(keyIterator.hasNext()) {
         String key = keyIterator.next();
         Integer value = map.get(key);
         System.out.println("/t"+key+":"+ value);
      }
      System.out.println();
      
      map.remove("��");
      System.out.println("�� ���� : "+map.size());
      
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
      System.out.println("�� ���� : " +map.size());
   }
}
