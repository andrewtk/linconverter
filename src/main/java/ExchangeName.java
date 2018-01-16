import org.jooq.DSLContext;
import org.jooq.SQLDialect;
import org.jooq.impl.DSL;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ExchangeName {
    public static void main(String[] args) {
        exchangeNameInLink();
    }

    public static void exchangeNameInLink() {
        String userName = "root";
        String password = "root";
        String url = "jdbc:mysql://localhost:3306/lorgNew?autoReconnect=true&useSSL=false";
        String urlOld = "jdbc:mysql://localhost:3306/lorg?autoReconnect=true&useSSL=false";
        System.out.println("Connecting database");

        try (Connection conn = DriverManager.getConnection(url, userName, password)) {
            DSLContext db = DSL.using(conn, SQLDialect.MYSQL);
            System.out.println("Connected database  " + db + " successfully...");

            System.out.println("Try to connected to database ");
            try (Connection conOld = DriverManager.getConnection(urlOld, userName, password)) {
                DSLContext dbOld = DSL.using(conOld, SQLDialect.MYSQL);
                System.out.println("Connected database " + dbOld + " successfully...");
















            } catch (SQLException sqlEx) {
                sqlEx.printStackTrace();
            }
        } catch (SQLException sqlEx) {
            sqlEx.printStackTrace();
        }
    }
}
