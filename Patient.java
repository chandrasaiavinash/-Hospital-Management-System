import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class Patient {
	public void addPatient(String name, int age, String disease) {
        try {
            Connection con = DBConnection.connect();
            String query = "INSERT INTO patients (name, age, disease) VALUES (?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, name);
            ps.setInt(2, age);
            ps.setString(3, disease);
            ps.executeUpdate();
            System.out.println("Patient added.");
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

    public void showPatients() {
        try {
            Connection con = DBConnection.connect();
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM patients");

            while (rs.next()) {
                System.out.println("ID: " + rs.getInt("id") +
                        " | Name: " + rs.getString("name") +
                        " | Age: " + rs.getInt("age") +
                        " | Disease: " + rs.getString("disease"));
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }

}
