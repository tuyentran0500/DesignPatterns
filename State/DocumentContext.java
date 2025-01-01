package State;

public class DocumentContext {
    private DocumentState state;
    public DocumentContext(){
        this.state = new DraftState();
    }   

    public void setState(DocumentState state) {
        this.state = state;
    }

    public void render(){
        this.state.render();
    }

    public void publish(){
        state.publish(this);
    }
}
