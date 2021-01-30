package patterns.structural.adapter;

import lombok.Data;

@Data
public class Connection {
    private Equipment equipment;

    public Connection(Equipment equipment) {
        this.equipment = equipment;
    }
}
