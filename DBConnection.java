import java.sql.*;

public class DBConnection {
    public static Connection connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver"); // Load JDBC driver
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/hospital", "root", "root");
            return con; // ✅ Return connection
        } catch (Exception e) {
            System.out.println("Connection Failed: " + e);
            return null;
        }
    }
}
