package AbstractFactory.Factory;

import AbstractFactory.Button.Button;
import AbstractFactory.Button.MacButton;
import AbstractFactory.Checkbox.Checkbox;
import AbstractFactory.Checkbox.MacCheckbox;

public class MacGUIFactory implements GUIFactory {
    public Button createButton(){
        return new MacButton();
    }
    public Checkbox createCheckbox(){
        return new MacCheckbox();
    }
}
