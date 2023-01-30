import java.sql.*;

public class Main {
    public static void main(String[] args) throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection cx = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/test-jdbc",
                "your username",
                "your password");
        Statement st = cx.createStatement();
        ResultSet rs = st.executeQuery("SELECT * FROM personnes");
        while (rs.next()) {
            String nom = rs.getString("nom");
            String prenom = rs.getString("prenom");
            int note = rs.getInt("note");
            System.out.println(nom + " " + prenom + " a " + note + "/20");
        }
        rs.close();
        st.close();
        cx.close();
    }
}
