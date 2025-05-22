package csbca2503.plms;

import java.sql.SQLException;

class TestSlot {
    public static void main(String[] args) throws SQLException {
        Slot[] slots = Slot.getSlots();
        // displaySlots(slots);
        // Slot s1 = new Slot("S003", "4W");
        // displaySlots(slots);
        // s1.save();
    }

    public static void displaySlots(Slot[] slots) {
        System.out.printf("Id\tType\n");
        System.out.printf("------------------------------------\n");
        for (Slot slot : slots) {
            System.out.printf("%-10s%-30s", slot.getId(), slot.getType());
        }
    }
}