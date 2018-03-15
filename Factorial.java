import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        int result = 1;
        Scanner scan = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            result =  (result * i);
        }
        System.out.println(result);
    }
}
