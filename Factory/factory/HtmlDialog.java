package Factory.factory;

import Factory.buttons.Button;
import Factory.buttons.HtmlButton;

public class HtmlDialog extends Dialog {
    @Override
    public Button createButton() {
        // TODO Auto-generated method stub
        return new HtmlButton();
    }
}
