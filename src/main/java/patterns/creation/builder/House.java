package patterns.creation.builder;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Collection;

@Data
@AllArgsConstructor
public class House {
    private Wall wall;
    private Roof roof;
    private Floor floor;
    private Collection<Door> doors;
    private Collection<Window> windows;

    public House() {
        doors = new ArrayList<>();
        windows = new ArrayList<>();
    }
}
