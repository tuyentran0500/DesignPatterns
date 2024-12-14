public class RealDatabase implements Database{
    public RealDatabase(){
        connectToDatabase();
    }

    private void connectToDatabase() {
        System.out.println("Connecting to the database...");
        // Simulate expensive operation
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void fetchData() {
        System.out.println("Fetching database");
    }
}
