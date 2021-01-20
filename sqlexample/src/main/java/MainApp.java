import java.sql.*;

public class MainApp {
    private static Connection connection;
    private static Statement statement;
    private static PreparedStatement preparedStatement;

    public static void main(String[] args) {

        try {
            connect();
//            insert();
//            select();
//            updateEx();
//            deleteEx();
//            dropEx();
            clearTableEX();
//            batchEx();
//            rollBackEx();


        } catch (SQLException throwables) {
            throwables.printStackTrace();
        } finally {
            disconnect();
        }

    }

    private static void rollBackEx() throws SQLException {
        statement.executeUpdate("INSERT INTO students (name, scope) VALUES ('Vaclau1', 100);");
        Savepoint sp1 = connection.setSavepoint();
        statement.executeUpdate("INSERT INTO students (name, scope) VALUES ('Vaclau2', 100);");
        connection.rollback(sp1);
        statement.executeUpdate("INSERT INTO students (name, scope) VALUES ('Vaclau3', 100);");
        connection.commit();
    }

    private static void batchEx() throws SQLException {
        connection.setAutoCommit(false);
        for (int i = 0; i < 10_000; i++) {
            preparedStatement.setString(1, "Zianon" + (i + 1));
            preparedStatement.setInt(2, 50);
            preparedStatement.addBatch();
        }
        preparedStatement.executeBatch();
        connection.commit();
    }

    private static void transactionAndPreparedStatementEx() throws SQLException {
        connection.setAutoCommit(false);
        for (int i = 0; i < 10_000; i++) {
            preparedStatement.setString(1, "Zianon" + (i + 1));
            preparedStatement.setInt(2, 50);
            preparedStatement.executeUpdate();
        }
        connection.commit();
    }

    private static void clearTableEX() throws SQLException {
        statement.executeUpdate("DELETE FROM students");
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
            preparedStatement = connection.prepareStatement("INSERT INTO students (name, scope) VALUES (?,?)");
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
