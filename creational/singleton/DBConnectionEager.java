public class DBConnectionEager {
    // Eagerly initialized the instance vaiable linked to class, when class is loaded 
    private static DBConnectionEager instance = new DBConnectionEager();

    // Keep constructor private
    private DBConnectionEager(){}

    // Simply return the instance 
    public static DBConnectionEager getConenction() {
        return instance;
    }
}
