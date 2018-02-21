public class CanYouSolveIt {
    public static void main (String[] args) {
        int num = (int) (Math.random() * 7) + 1;

        System.out.println("삐빅");
        System.out.println();
        if (num == 1) {
            System.out.println("월요일");
        }
        else if (num == 2) {
            System.out.println("화요일");
        }
        else if (num == 3) {
            System.out.println("수요일");
        }
        else if (num == 4) {
            System.out.println("목요일");
        }
        else if (num == 5) {
            System.out.println("금요일");
        }
        else if (num == 6){
            System.out.println("토요일");
        }
        else {
            System.out.println("일요일");
        }
    }
}
