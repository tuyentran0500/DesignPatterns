package Memento;

import java.util.Stack;

public class Caretaker {
    private final Stack<TextEditorMemento> history = new Stack<>();

    public void save(TextEditor textEditor){
        history.push(textEditor.save());
    }

    public void undo(TextEditor textEditor){
        if (!history.isEmpty()){
            textEditor.restore(history.pop());
        }
    }
    
}
