package Builder;

public class Computer {
    // Required parameters
    private String CPU;

    // Optional parameters
    private int RAM;
    
    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM=" + RAM +
                '}';
    }
}
