public class FakeTimer {
    public static void main(String[] args) {
        long time1 = System.nanoTime();

        int sum = 0;
        for (int i = 1; i <= 1000000; i++) {
            sum += i;
            System.out.println("째깍");
        }


        long time2 = System.nanoTime();
        System.out.println("합 : " + sum);
        System.out.println("소요된 시간 : " + (time2 - time1));
    }
}
