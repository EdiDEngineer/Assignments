package ThinkingInJava.Excercises.Access_Control;

class Connection {
    private Connection() {     System.out.println("Connection()"); }
    static Connection connection() {
        return new Connection();
    }
}

public class Excercise8 {
    static int remainingConnections = 10;
    static Connection[] connections = new Connection[10];
    static {
        for(Connection connection : connections)
            connection = Connection.connection();
    }
    public static Connection getConnection() {
        if(remainingConnections > 0)
            return connections[--remainingConnections];
        else {
            System.out.println("Done connections");
            return null;
        }
    }
    public static void main(String[] args) {
        System.out.println(remainingConnections);
        getConnection();
        getConnection();
        System.out.println(remainingConnections);
        getConnection();
        System.out.println(remainingConnections);
    }
}

