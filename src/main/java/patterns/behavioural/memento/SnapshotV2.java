package patterns.behavioural.memento;

import lombok.Data;

@Data
public class SnapshotV2 {
    private final Gui gui;

    public SnapshotV2(Gui gui) {
        this.gui = gui;
    }
}
