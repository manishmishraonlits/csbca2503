package csbca2503.plms;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

public class Slot {

    private String id;
    private String type;

    public Slot() {
    }

    public Slot(String id, String type) {
        this.id = id;
        this.type = type;
    }

    public String getId() {
        return id;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public Slot getSlot() {
        return this;
    }

    public void save() throws SQLException {
        final String url = "jdbc:mysql://localhost:3306/plms_2503";
        final String user = "csbca2503";
        final String password = "csbca2503";
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "INSERT INTO slot(id, type) VALUES('" + id + "', '" + type + "');";
        Statement statement = connection.createStatement();
        statement.executeUpdate(sql);
        connection.close();
        System.out.println("Data inserted!");
    }

    public static ArrayList<Slot> getSlots() throws SQLException {
        ArrayList<Slot> slots = new ArrayList<Slot>();
        final String url = "jdbc:mysql://localhost:3306/plms_2503";
        final String user = "csbca2503";
        final String password = "csbca2503";
        Connection connection = DriverManager.getConnection(url, user, password);
        String sql = "SELECT * FROM slot";
        Statement statement = connection.createStatement();
        ResultSet resultSet = statement.executeQuery(sql);
        while(resultSet.next()){
            slots.add(new Slot(resultSet.getString("id"), resultSet.getString("type")));
        }
        connection.close();
        return slots;
    }

}
