import java.util.*;

public class ArrayListExample {
    public static void main(String[] args) {
        
    
    List<String> list = new ArrayList<String>();

    list.add("Java");
    list.add("ABCD");
    list.add("Korea");
    list.add(2, "Digital");
    list.add("High");
    list.add("High");

    int size = list.size();
    System.out.println("ÃÑ °´Ã¼ ¼ö : " + size);
    System.out.println();

    String skill = list.get(2);
    System.out.println("2 : " + skill);
    System.out.println();

    for (int i = 0; i < list.size(); i++) {
        String str = list.get(i);
        System.out.println(i + ": " + str);
    }
    System.out.println();
    list.remove("High");

    for (int i = 0; i < list.size(); i++) {
        String str = list.get(i);
        System.out.println(i  + " : " + str);
    }
}
}
