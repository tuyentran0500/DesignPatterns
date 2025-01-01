package Builder;

public class Computer {
    // Required parameters
    private String CPU;

    // Optional parameters
    private int RAM;

    public Computer(Builder builder){
        this.CPU = builder.CPU;
        this.RAM = builder.RAM;
    }
    public static class Builder {
        private String CPU;
        private int RAM;
        public Builder(String CPU){
            this.CPU = CPU;
            RAM = 0;
        }

        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this;
        }

        public Computer build(){
            return new Computer(this);
        }
    }
    
    @Override
    public String toString() {
        return "Computer{" +
                "CPU='" + CPU + '\'' +
                ", RAM=" + RAM +
                '}';
    }
}
