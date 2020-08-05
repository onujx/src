import java.util.Comparator;
public class Fruit {
    public String name;
    public int quantity;

    public Fruit(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public static Comparator<Fruit> nameComparator = new Comparator<Fruit>() {
        @Override
        public int compare(Fruit o1, Fruit o2) {
            return o1.name.compareTo(o2.name);
        }
    };

    public static Comparator<Fruit> quantityComparator = new Comparator<Fruit>() {
        @Override
        public int compare(Fruit o1, Fruit o2) {
            return o1.quantity - o2.quantity;
        }
    };
}