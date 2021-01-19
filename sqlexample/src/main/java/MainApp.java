import java.sql.*;

public class MainApp {
    private static Connection connection;
    private static Statement statement;

    public static void main(String[] args) {

        try {
            connect();
            //           insert();
            //select();
//            updateEx();
//            deleteEx();
//            dropEx();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            disconnect();
        }

    }

    private static void dropEx() throws SQLException {
        statement.executeUpdate("DROP FROM students");
    }

    private static void deleteEx() throws SQLException {
        statement.executeUpdate("DELETE FROM students WHERE id=3");
    }

    private static void updateEx() throws SQLException {
        statement.executeUpdate("UPDATE students SET scope =80 WHERE id=1;");
    }

    private static void select() {
        try (ResultSet rs = statement.executeQuery("SELECT*FROM students")) {
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " " + rs.getString("name") + " " + rs.getInt("scope"));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private static void insert() throws SQLException {
        statement.executeUpdate("INSERT INTO students (name, scope) VALUES ('Vaclau', 100);");
    }

    public static void connect() throws SQLException {
        try {
            Class.forName("org.sqlite.JDBC");
            connection = DriverManager.getConnection("jdbc:sqlite:main.db");
            statement = connection.createStatement();
        } catch (ClassNotFoundException | SQLException e) {
            throw new SQLException("Unable to connect");
        }
    }

    public static void disconnect() {
        try {
            statement.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            connection.close();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

}
