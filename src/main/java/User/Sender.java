package User;

public class Sender implements User {
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
