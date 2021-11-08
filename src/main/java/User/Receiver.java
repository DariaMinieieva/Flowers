package User;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Receiver implements User{
    private static int id;

    @Override
    public void setID(int currID) {
        id = currID;
    }

    @Override
    public String update(String status) {
        return "Status: " + status;
    }
}
