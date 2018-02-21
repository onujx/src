public class OverflowExample {
    public static void main(String[] args) {
        int x = 10000000;
        int y = 10000000;
        long z = x + y;
        System.out.println(z);
    }
}
