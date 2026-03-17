package conexao;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConexaoDB {

    public static Connection getConnection() {
        try {
            String url = "jdbc:mariadb://localhost:3306/poafilmes";
            String user = "root";
            String password = "root";

            Class.forName("org.mariadb.jdbc.Driver");

            return DriverManager.getConnection(url, user, password);

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}