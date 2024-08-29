package AbstractFactory.Factory;

import AbstractFactory.Button.Button;
import AbstractFactory.Button.WinButton;
import AbstractFactory.Checkbox.Checkbox;
import AbstractFactory.Checkbox.WinCheckbox;

public class WinGUIFactory implements GUIFactory {
    @Override
    public Button createButton() {
        // TODO Auto-generated method stub
        return new WinButton();
    }
    @Override
    public Checkbox createCheckbox() {
        // TODO Auto-generated method stub
        return new  WinCheckbox();
    }
}
