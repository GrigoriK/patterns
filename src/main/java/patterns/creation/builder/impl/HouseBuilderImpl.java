package patterns.creation.builder.impl;

import general.Color;
import lombok.Getter;
import patterns.creation.builder.*;
import patterns.creation.builder.interfaces.HouseBuilder;

public class HouseBuilderImpl implements HouseBuilder {
    @Getter
    private House house;


    public HouseBuilderImpl() {
        this.house = new House();
    }

    @Override
    public void buildWall(Wall wall) {
        house.setWall(wall);
    }

    @Override
    public void buildRoof(Roof roof) {
        house.setRoof(roof);
    }

    @Override
    public void buildFloor(Floor floor) {
        house.setFloor(floor);
    }

    @Override
    public void buildWindows(Window window) {
        house.getWindows().add(window);
    }

    @Override
    public void buildDoor(Door door) {
        house.getDoors().add(door);
    }

    public void buildIKEAYellowHouse() {
        String manufacturerName = "IKEA";
        buildWall(new Wall(Color.YELLOW, manufacturerName));
        buildFloor(new Floor(Color.YELLOW, manufacturerName));
        buildRoof(new Roof(Color.YELLOW, manufacturerName));
        buildDoor(new Door(Color.YELLOW, manufacturerName));
        buildWindows(new Window(Color.YELLOW, manufacturerName));
    }

    @Override
    public void resetConstruction() {
        house = new House();
    }

}
