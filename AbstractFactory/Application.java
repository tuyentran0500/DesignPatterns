package AbstractFactory;

import AbstractFactory.Button.Button;
import AbstractFactory.Checkbox.Checkbox;
import AbstractFactory.Factory.GUIFactory;

public class Application {
    private Button button;
    private Checkbox checkbox;
    public Application(GUIFactory factory){
        button = factory.createButton();
        checkbox = factory.createCheckbox();
    }

    public void paint(){
        button.paint();
        checkbox.paint();
    }
}
