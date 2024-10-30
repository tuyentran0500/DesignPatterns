### Problem with the Normal Way (Telescoping Constructor Problem)

In the normal way, we might use a constructor with multiple parameters for an object with many configurations. However, if there are several optional parameters, this can lead to telescoping constructors — constructors with increasing numbers of parameters that can become unreadable and error-prone. For example:

```java
public class Computer {
    private String CPU;
    private String GPU;
    private int RAM;
    private int storage;
    private boolean isBluetoothEnabled;
    private boolean isWiFiEnabled;

    public Computer(String CPU, String GPU, int RAM, int storage, boolean isBluetoothEnabled, boolean isWiFiEnabled) {
        this.CPU = CPU;
        this.GPU = GPU;
        this.RAM = RAM;
        this.storage = storage;
        this.isBluetoothEnabled = isBluetoothEnabled;
        this.isWiFiEnabled = isWiFiEnabled;
    }
}

// Usage example
Computer computer = new Computer("Intel i5", "NVIDIA GTX 1050", 16, 500, true, false);

```

**Builder**

```java
// The main class
public class Computer {
    // Required parameters
    private String CPU;
    private String GPU;

    // Optional parameters
    private int RAM;
    private int storage;
    private boolean isBluetoothEnabled;
    private boolean isWiFiEnabled;

    // Private constructor to enforce use of Builder
    private Computer(Builder builder) {
        this.CPU = builder.CPU;
        this.GPU = builder.GPU;
        this.RAM = builder.RAM;
        this.storage = builder.storage;
        this.isBluetoothEnabled = builder.isBluetoothEnabled;
        this.isWiFiEnabled = builder.isWiFiEnabled;
    }

    // Static nested Builder class
    public static class Builder {
        // Required parameters
        private String CPU;
        private String GPU;

        // Optional parameters with default values
        private int RAM = 8;
        private int storage = 256;
        private boolean isBluetoothEnabled = false;
        private boolean isWiFiEnabled = false;

        // Constructor for required parameters
        public Builder(String CPU, String GPU) {
            this.CPU = CPU;
            this.GPU = GPU;
        }

        // Setter-like methods for optional parameters
        public Builder setRAM(int RAM) {
            this.RAM = RAM;
            return this; // Enable chaining
        }

        public Builder setStorage(int storage) {
            this.storage = storage;
            return this;
        }

        public Builder setBluetoothEnabled(boolean isBluetoothEnabled) {
            this.isBluetoothEnabled = isBluetoothEnabled;
            return this;
        }

        public Builder setWiFiEnabled(boolean isWiFiEnabled) {
            this.isWiFiEnabled = isWiFiEnabled;
            return this;
        }

        // Build method to create the final object
        public Computer build() {
            return new Computer(this);
        }
    }

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

// Client code to use the Builder Pattern
public class Main {
    public static void main(String[] args) {
        Computer gamingComputer = new Computer.Builder("Intel i7", "NVIDIA RTX 3080")
                .setRAM(32)
                .setStorage(1000)
                .setBluetoothEnabled(true)
                .setWiFiEnabled(true)
                .build();

        System.out.println(gamingComputer);

        Computer basicComputer = new Computer.Builder("AMD Ryzen 5", "Integrated GPU")
                .build();

        System.out.println(basicComputer);
    }
}
```