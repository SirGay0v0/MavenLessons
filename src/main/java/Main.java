import javax.smartcardio.ATR;
import javax.swing.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Main {
    static final String JDBC_DRIVER = "org.h2.Driver";
    static final String DB_URL = "jdbc:h2:~/test";

    static final String USER = "root";
    static final String PASS = "";

    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;
        try {
            //Регистрируем драйвер
            Class.forName(JDBC_DRIVER);

            System.out.println("Соединение с БД");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //Выполнение соединения
            stmt = conn.createStatement();
            String sql = "CREATE TABLE REG " +
                    "(id INTEGER not NULL, " +
                    "first VARCHAR(255), " +
                    "last VARCHAR(255), " +
                    "age INTEGER, " +
                    "PRIMARY KEY (id))";
            stmt.executeUpdate(sql);

            System.out.println("Создана таблица в БД");

            //освобождение ресурсов
            stmt.close();
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
