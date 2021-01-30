package patterns.structural.adapter;

import lombok.Data;

@Data
public class Equipment {
    private String equipmentName;

    public Equipment(String equipmentName) {
        this.equipmentName = equipmentName;
    }
}
