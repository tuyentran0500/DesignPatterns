package Command;

public class Controller {
    private Command command;
    public void setCommand(Command command) {
        this.command = command;
    }

    public void setButton(){
        if (command != null){
			command.execute();
		}
    }
}
