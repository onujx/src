public class Boy {
    String model;
    int speed;

    Boy (String model) {
        this.model = model;
    }
    void setSpeed(int Speed) {
        this.speed = speed;
    }
    void run() {
        for (int i = 10; i <= 50; i += 10) {
            this.setSpeed(i);
            System.out.println(this.model + "가 달립니다.(시속:" + this.speed + "km/h)");
        }

    }
}