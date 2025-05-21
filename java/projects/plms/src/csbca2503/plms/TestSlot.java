package csbca2503.plms;

import java.sql.SQLException;

class TestSlot {
    public static void main(String[] args) throws SQLException {
        Slot s1 = new Slot("S003", "4W");
        s1.getSlot();
        s1.save();
    }
}