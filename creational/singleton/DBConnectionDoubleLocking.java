public class DBConnectionDoubleLocking {
    //Single instance 
    private static DBConnectionDoubleLocking dbConnection;

    //make constructor private
    private DBConnectionDoubleLocking() { }

    public static DBConnectionDoubleLocking getConnection() {
        // First check (not synchronized)
        if(dbConnection == null) {
             // Synchronize on the class object
            synchronized(DBConnectionDoubleLocking.class){
                // Second check (synchronized)
                if(dbConnection == null) {
                     // If null, create a new instance
                    dbConnection = new DBConnectionDoubleLocking();
                }
            }
        }
         // Return the instance (either newly created or existing)
        return dbConnection;
    }

}
