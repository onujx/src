public interface RemoteControl {
    int MAX_VOLUME = 10;
    int MIN_VOLUME = 0;

    void turnOn();
    void turnOff();
    void setVolume(int volume);

    default void setMute(boolean mute) {
        if (mute) {
            System.out.println("Mute set");
        } else {
            System.out.println("Mute unset");
        }
    }

    static void changeBattery() {
        System.out.println("Battery Change");
    }
}