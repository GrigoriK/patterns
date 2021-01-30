package patterns.creation.builder;

import general.Color;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class BuildingProducts {
    private Color color;
    private String manufacturerName;

    @Override
    public String toString() {
        return this.getClass().getSimpleName()+"{" +
                "color=" + color +
                ", manufacturerName='" + manufacturerName + '\'' +
                '}';
    }
}
