import java.util.Objects;

public class Hash {
    public static void main(String[] args) {
        test t1 = new test(1, "wow");
        test t2 = new test(2, "yeah");
        System.out.println(t1.hashCode());
        System.out.println(Objects.hashCode(t2));
    }
}

class test {
    int number;
    String data;
    
    test(int number, String data) {
        this.number = number;
        this.data = data;
    }
    public int hashCode() {
        return Objects.hash(number, data);
    }
}