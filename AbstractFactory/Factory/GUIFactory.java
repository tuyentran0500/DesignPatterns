package AbstractFactory.Factory;

import AbstractFactory.Button.Button;
import AbstractFactory.Checkbox.Checkbox;

public interface GUIFactory {
    public Button createButton();
    public Checkbox createCheckbox();
}
