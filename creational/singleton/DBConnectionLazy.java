public class DBConnectionLazy {
    //Keep single instance only and will initialized when is required like ( getConnection() method is invoked)
    private static DBConnectionLazy instance;

    //Keep constructor private only
    private DBConnectionLazy(){}
    
    // fetch instance using static method
    public static DBConnectionLazy getConnection() {
        // Check if instance is null
        if(instance == null) {
             // If null, create a new instance
            instance = new DBConnectionLazy();
        }

        // Return the instance (either newly created or existing)
        return instance;
    }
}
