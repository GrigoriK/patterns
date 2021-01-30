package patterns.structural.flyweight;

import lombok.Data;
import patterns.structural.flyweight.enums.KindOfRepair;

@Data
public class Locksmith {
    private String name;
    private KindOfRepair kindOfRepair;

    public Locksmith(KindOfRepair kindOfRepair) {
        setName();
        this.kindOfRepair = kindOfRepair;
    }

    private void setName() {
        name = Names.getRandomName();
    }

}
