package Command;

public class TurnOffCommand implements Command {
    private Light light;
    public TurnOffCommand(Light light){
        this.light = light;
    }
    @Override
    public void execute() {
        // TODO Auto-generated method stub]
        light.turnOff();
    }

}
