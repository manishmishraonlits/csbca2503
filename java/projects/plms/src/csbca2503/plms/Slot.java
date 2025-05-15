package csbca2503.plms;

import java.sql.Connection;

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

    void save() {
        Connection connection = new Connection();
    
    }
}
