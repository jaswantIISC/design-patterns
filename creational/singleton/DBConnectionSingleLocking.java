public class DBConnectionSingleLocking {
    //Keep single instance only
    private static DBConnectionSingleLocking instance;

    //Keep constructor private only
    private DBConnectionSingleLocking(){}

    // fetch instance using static method with thread safe, single locking
    public static synchronized DBConnectionSingleLocking getConnection() {
        if(instance == null) {
            instance = new DBConnectionSingleLocking();
        }
        return instance;
    }
}
