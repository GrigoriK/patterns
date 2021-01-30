package patterns.behavioural.memento;

import lombok.Getter;


public class Project {
    private int version = 0;
    @Getter
    private Snapshot snapshot;
    @Getter
    private SnapshotV2 snapshotV2;

    public void setSnapshot(Snapshot snapshot) {
        version++;
        this.snapshot = snapshot;
    }

    public void setSnapshotV2(SnapshotV2 snapshotV2) {
        version++;
        this.snapshotV2 = snapshotV2;
    }

    public int getSaveVersion() {
        return version;
    }
}
