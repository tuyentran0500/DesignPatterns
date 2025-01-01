package Mediator;

public class ChatUser extends User {
    public ChatUser(ChatMediator chatMediator, String name){
        super(chatMediator, name);
    }

    @Override
    public void send(String message) {
        System.out.println(name + " sends: " + message);
        chatMediator.sendMessage(message, this);
    }

    @Override
    public void receive(String message) {
        System.out.println(name + " receives: " + message);    
    }

}
