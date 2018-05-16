public abstract class Phone {

    public String owner;

    public Phone(String owner) {
        this.owner = owner;
    }

    public void turnOn() {

        System.out.println("전원 켜짐");
    }
    public void turnOff() {

        System.out.println("전원 꺼짐");
    }
}

class SmartPhone extends Phone {
    public SmartPhone(String owner) {
        super(owner);
    }

    public void internetSearch() {
        System.out.println("Searching...");
    }
}

class PhoneExample {
    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone("test");

        smartPhone.turnOn();
        smartPhone.internetSearch();
        smartPhone.turnOff();
    }
}
