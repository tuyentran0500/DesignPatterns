package Mediator;

import java.util.ArrayList;
import java.util.List;

public class ChatRoom implements ChatMediator {
    private List<User> users;
    public ChatRoom(){
        users = new ArrayList<>();
    }

    public void addUser(User user){
        users.add(user);
    }

    @Override
    public void sendMessage(String message, User user) {
        for(User u : users){
            if (u != user){
                u.receive(message);
            }
        }
    }
}
