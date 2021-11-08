package db;

public class Connection {
    private static Connection thisConnection = new Connection();
    private static int ttt = 0;
    private Connection() {

    }
    private static Connection getConnection() {
        if (thisConnection == null) {
            thisConnection = new Connection();
        }
        return thisConnection;
    }
}
