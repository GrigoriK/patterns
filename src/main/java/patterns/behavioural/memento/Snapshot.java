package patterns.behavioural.memento;

import lombok.Data;
import patterns.behavioural.memento.interfaces.Shape;

import java.util.Collection;

@Data
public class Snapshot {
    private final String mainColor;
    private final String fontName;
    private final Collection<Shape> shapes;

    public Snapshot(String mainColor, String fontName, Collection<Shape> shapes) {
        this.mainColor = mainColor;
        this.fontName = fontName;
        this.shapes = shapes;
    }
}
