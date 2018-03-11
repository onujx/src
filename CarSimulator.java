public class CarSimulator {
    public static void main(String args[]) {
        String[] TalkFunc = null;
        int[] WaitngForYou = {1, 2, 3, 4, 5};
        TalkFunc = new String[] {"Hello, I hate you."};
        for (int time : WaitngForYou) {
            time++;
            System.out.println("ha");
        }

        System.out.println(TalkFunc[0]);
    }
}
