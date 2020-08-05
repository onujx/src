import java.util.*;

public class ArraySortTest {
    public String name;
    public int quantity;
    public ArraySortTest(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }
    public static void main(String[] args) {
        String [] fruits = new String [] {"a", "b","c", "d"};
        Arrays.sort(fruits);
        for (String name : fruits) {
            System.out.println(name);
        }

        List<String> fruits2 = new ArrayList<String>();
        fruits2.add("Pineapple");
        fruits2.add("Apple");
        fruits2.add("Orange");
        fruits2.add("Banana");

        Collections.sort(fruits2);
        for (String name : fruits2) {
            System.out.println(name);
        }
        ArraySortTest [] arr = new ArraySortTest[4];
        arr[0] = new ArraySortTest("Pineapple", 70);
        arr[1] = new ArraySortTest("Apple", 100);
        arr[2] = new ArraySortTest("Orange", 80);
        arr[3] = new ArraySortTest("Banana", 90);


    }
}
