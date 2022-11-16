import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class H2Insert {
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
            String sql = "INSERT INTO REG " + "VALUES(10, 'Ivan', 'Ivanov', 18)";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO REG " + "VALUES(20, 'Igor', 'Ivanov', 20)";
            stmt.executeUpdate(sql);

            sql = "INSERT INTO REG " + "VALUES(25, 'Ilya', 'Ivanov', 25)";
            stmt.executeUpdate(sql);



            System.out.println("Данные добавлены в таблицу");

            //освобождение ресурсов
            stmt.close();
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
