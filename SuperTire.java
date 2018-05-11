package Test_20180508;

public class SuperTire {

    public int maxRotation;
    public int accumulatedRotation;
    public String location;

    public SuperTire(String location, int maxRotation) {
        this.location = location;
        this.maxRotation = maxRotation;
    }

    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + "Tire 수명 : "+(maxRotation-accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + "Tire 펑크 ***");
            return false;
        }
    }
}

class SuperCar {
    SuperTire frontLeftTire = new SuperTire("앞왼쪽", 6);
    SuperTire frontRightTire = new SuperTire("앞오른쪽", 2);
    SuperTire backLeftTire = new SuperTire("뒤왼쪽", 3);
    SuperTire backRightTire = new SuperTire("뒤오른쪽", 4);

    int run() {
        System.out.println("[자동차가 달립니다.]");
        if (frontLeftTire.roll() == false) { stop(); return 1;}
        if (frontRightTire.roll() == false) { stop(); return 1;}
        if (backLeftTire.roll() == false) { stop(); return 1;}
        if (backRightTire.roll() == false) { stop(); return 1;}

        return 0;
    }

    void stop() {
        System.out.println("[자동차가 멈춥니다.]");
    }
}

class HankookTire extends SuperTire {
    public HankookTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + "HankookTire 수명:" + (maxRotation-accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + "HankookTire 펑크 ***");
            return false;
        }
    }
}

class KumhoTire extends SuperTire {
    public KumhoTire(String location, int maxRotation) {
        super(location, maxRotation);
    }

    @Override
    public boolean roll() {
        ++accumulatedRotation;
        if (accumulatedRotation < maxRotation) {
            System.out.println(location + "KumhoTire 수명: " + (maxRotation - accumulatedRotation) + "회");
            return true;
        } else {
            System.out.println("*** " + location + "KumhoTire 펑크 ***");

            return false;
        }
    }
}