package Factory.factory;

import Factory.buttons.Button;
import Factory.buttons.WindowsButton;

public class WindowsDialog extends Dialog {
    @Override
    public Button createButton() {
        // TODO Auto-generated method stub
        return new WindowsButton();
    }
}
