public class Main {
    public static void main(String[] args) {
        Database database = new DatabaseProxy();
        System.out.println("Proxy created. No connection yet.");

        // Fetch data for the first time, which will trigger the connection
        database.fetchData();

        // Fetch data again, this time the connection is already established
        database.fetchData();
    }
}