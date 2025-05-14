package Command;

public class Main {
    public static void main(String[] args) {
        Light light = new Light();

        TurnOnCommand turnOnCommand = new TurnOnCommand(light);
        TurnOffCommand turnOffCommand = new TurnOffCommand(light);

        Controller controller = new Controller();
        controller.setCommand(turnOffCommand);
        controller.setButton();
        controller.setCommand(turnOnCommand);
        controller.setButton();
    }
}
