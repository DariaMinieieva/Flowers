package orders;
import User.User;
import lombok.Getter;

import java.util.ArrayList;
import java.util.List;


public class Order {
    List<User> users = new ArrayList<User>();
    private static int currID = 0;

    public int getID() {
        return currID;
    }

    public void addUser(User user) {
        user.setID(++currID);
        users.add(user);
    }

    public void removeUser(User user) {
        users.remove(user);
        currID--;
    }

    public String notifyUsers() {
        String res = "";
        for (int i = 0; i < users.size(); i++) {
            res += users.get(i).update("Notification!");
        }

        return res;
    }

    public String order(){
        return notifyUsers();
    }
}
