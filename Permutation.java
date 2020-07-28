import static java.util.Arrays.swap;

public class Permutation {

    char data[] = {'a', 'b', 'c', 'd'};
    int n = 4;

    void permutation(int k) {
        if (k == n) {
            for (int i = 0; i < data.length; i++) {
                System.out.println(data[i]);
                return;
            }
        }
    }
    for(int i = k; i < n; i++) {
        swap(data, k, i);
        permutation();
    }
}
