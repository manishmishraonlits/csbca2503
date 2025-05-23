package csbca2503.plms;

import java.sql.SQLException;
import java.util.ArrayList;

class TestSlot {

    public static void main(String[] args) throws SQLException {
        ArrayList<Slot> slots = Slot.getSlots();
        displaySlots(slots);
        // Slot s1 = new Slot("S003", "4W");
        // displaySlots(slots);
        // s1.save();
    }

    public static void displaySlots(ArrayList<Slot> slots) {
        System.out.printf("%-10s%-30s\n", "Id", "Type");
        System.out.printf("-----------------------------\n");
        for (Slot slot : slots) {
            System.out.printf("%-10s%-30s\n", slot.getId(), slot.getType());
        }
        System.out.printf("-----------------------------\n");
    }
}
