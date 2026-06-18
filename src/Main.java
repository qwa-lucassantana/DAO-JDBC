import db.DB;
import java.sql.Connection;

public class Main {
    public static void main(String[] args) {

        Connection conn = DB.getConnection();

        if (conn != null) {
            System.out.println("Ligação à base de dados realizada com sucesso!");
        }

        DB.closeConnection();
    }
}