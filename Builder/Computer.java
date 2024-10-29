package Builder;

public class Computer {
    // Required parameters
    private String CPU;
    private String GPU;

    // Optional parameters
    private int RAM;
    private int storage;
    private boolean isBluetoothEnabled;
    private boolean isWiFiEnabled;

    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", GPU='" + GPU + '\'' +
                ", RAM=" + RAM +
                ", storage=" + storage +
                ", isBluetoothEnabled=" + isBluetoothEnabled +
                ", isWiFiEnabled=" + isWiFiEnabled +
                '}';
    }
}
