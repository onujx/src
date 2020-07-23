public class BinarySearch {
    public BinarySearch(String[] args, String target, int begin, int i) {
    }

    public static Object main(String[] args, String target, int begin, int end) {
        if (begin > end) {
            return -1;
        }
        else {
            int middle = (begin + end) / 2;
            int compResult = target.compareTo(args[middle]);
            if (compResult == 0) {
                return middle;
            } else if (compResult < 0) {
                return new BinarySearch(args, target, begin, middle - 1);
            } else {
                return new BinarySearch(args, target, middle+1, end);
            }
        }
    }
}


