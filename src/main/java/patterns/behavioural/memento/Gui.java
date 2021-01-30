package patterns.behavioural.memento;

import lombok.Data;
import patterns.behavioural.memento.interfaces.Shape;

import java.util.ArrayList;
import java.util.Collection;
import java.util.stream.Collectors;

@Data
public class Gui {
    private String mainColor;
    private String fontName;
    private Collection<Shape> shapes = new ArrayList<>();

    public void addShape(Shape shape) {
        shapes.add(shape);
    }

    public void loadV1(Snapshot snapshot) {
        mainColor = snapshot.getMainColor();
        fontName = snapshot.getFontName();
        shapes = snapshot.getShapes();
    }

    public Snapshot getSnapshotV1() {
        return new Snapshot(mainColor, fontName, shapes);
    }

    public void loadV2(SnapshotV2 snapshotV2) {
        Gui gui = snapshotV2.getGui();
        mainColor = gui.getMainColor();
        fontName = gui.getFontName();
        shapes = gui.getShapes();
    }

    public SnapshotV2 getSnapshotV2() {
        return new SnapshotV2(getPrototype());
    }

    public Gui getPrototype() {
        Gui gui = new Gui();
        gui.setFontName(fontName);
        gui.setMainColor(mainColor);
        gui.setShapes(shapes);
        return gui;
    }

    @Override
    public String toString() {
        return "Gui{" +
                "mainColor='" + mainColor + '\'' +
                ", fontName='" + fontName + '\'' +
                ", shapes=" + "{" + shapes.stream().map(Shape::getName)
                .collect(Collectors.joining(",")) + "}" +
                '}';
    }
}
