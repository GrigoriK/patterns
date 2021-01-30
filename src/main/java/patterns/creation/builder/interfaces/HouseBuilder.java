package patterns.creation.builder.interfaces;

import patterns.creation.builder.*;

public interface HouseBuilder {
    void buildWall(Wall wall);

    void buildRoof(Roof roof);

    void buildFloor(Floor floor);

    void buildWindows(Window window);

    void buildDoor(Door door);

    void resetConstruction();
}
