import java.sql.*;

public class H2Print {
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
            String sql = "SELECT * FROM REG";
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String first = rs.getString("first");
                String last = rs.getString("last");

                System.out.print("ID " + id + " ");
                System.out.print("AGE " + age + " ");
                System.out.print("FIRST " + first + " ");
                System.out.print("LAST " + last + " ");
                System.out.println();
            }

            System.out.println("Данные добавлены в таблицу");

            //освобождение ресурсов
            stmt.close();
            conn.close();
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
