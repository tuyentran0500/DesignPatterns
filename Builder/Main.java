package Builder;

// Client code to use the Builder Pattern
// Client code to use the Builder Pattern
public class Main {
    public static void main(String[] args) {
        // Creating a computer with default RAM
        // Computer basicComputer = new Computer.Builder("Intel i5")
        //         .build();
        Computer basicComputer = new Computer.Builder("Intel 15").build();
         System.out.println(basicComputer);

        // // Creating a computer with custom RAM
         Computer highEndComputer = new Computer.Builder("Intel i7")
                 .setRAM(16)
                 .build();

         System.out.println(highEndComputer);
    }
}