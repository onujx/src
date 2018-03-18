public class p1 {
    //필드
    String model;
    int speed;

    //생성자
    p1(String model) {
        this.model = model;
    }

    //메소드
    void setSpeed(int speed) {
        this.speed = speed;
    }

    void run() {
        for(int i=10; i<=50; i+=10) {
            this.setSpeed(i);
            System.out.println(this.model + "가 멀어집니다." + this.speed + "km/h)");
        }
        System.out.println("위치 발견");
    }
}
