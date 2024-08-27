package Factory.buttons;

public class HtmlButton implements Button {
    public void render(){
        System.out.println("<button>Test Button</button>");
    }
    public void onClick(){
        System.out.println("Click! Button says - 'Hello World!'");
    }
}
