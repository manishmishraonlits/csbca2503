package csbca2503.plms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class Slot {

    private String id;
    private String type;

    public Slot() {
    }

    public Slot(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Slot getSlot() {
        return this;
    }

    void save() throws SQLException {
        String url = "jdbc:mysql://localhost:3306/plms_2503";
        String user = "csbca2503";
        String password = "csbca2503";
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "INSERT INTO slot(id, type) VALUES('" + id + "', '" + type + "');";
        Statement statement = connection.createStatement();
        statement.execute(sql);
        connection.close();
        System.out.println("Data inserted!");
    }
}
