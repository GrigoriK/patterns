package patterns.structural.composite;

import lombok.Data;

@Data
public class Leaf {
    private String leafColor;

    public Leaf(String leafColor) {
        this.leafColor = leafColor;
    }
}
