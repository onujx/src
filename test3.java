//수학에서의 집합과 같은 개념 
//원소가 중복되면 안된다.
//HashSet : 해쉬 테이블에 원소를 저장
//TreeSet : 레드 - 블랙 트리에 원소 저장
// LinkedHashSet : 해쉬 테이블과 연결 리스트를 결합.
//: 세종류가 있다. 
import java.util.*;
public class test3 {

   public static void main(String[] args) {
      // TODO Auto-generated method stub

      HashSet<String> set1 = new HashSet<String>();
      LinkedHashSet<String> set2 = new LinkedHashSet<String>();
      TreeSet<String> set3 = new TreeSet<String>();
      
      set1.add("E-Business");
      set1.add("Digital Contents");
      set1.add("Web Programming");
      set1.add("Hacking Defense");
      
      set2.add("E-Business");
      set2.add("Digital Contents");
      set2.add("Web Programming");
      set2.add("Hacking Defense");
      
      set3.add("E-Business");
      set3.add("Digital Contents");
      set3.add("Web Programming");
      set3.add("Hacking Defense");
      
      System.out.println(set1);
      System.out.println();
      System.out.println(set2);
      System.out.println();
      System.out.println(set3);
      
    
            
   }

}