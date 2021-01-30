package patterns.creation.prototype;

import lombok.Data;
import patterns.creation.prototype.carParts.*;
import patterns.creation.prototype.carParts.interfaces.Prototype;

import java.util.Collection;
import java.util.stream.Collectors;

@Data
public class Car implements Prototype<Car> {
    private Collection<Wheel> wheels;
    private Window window;
    private SteeringWheel steeringWheel;
    private Collection<Lighter> lighters;
    private Engine engine;
    private Collection<Door> doors;


    @Override
    public Car getPrototype() {
        Car car = new Car();
        car.setWheels(this.wheels.stream().map(Wheel::getPrototype).collect(Collectors.toList()));
        car.setWindow(this.window.getPrototype());
        car.setSteeringWheel(this.steeringWheel.getPrototype());
        car.setLighters(this.lighters.stream().map(Lighter::getPrototype).collect(Collectors.toList()));
        car.setEngine(this.engine.getPrototype());
        car.setDoors(this.doors.stream().map(Door::getPrototype).collect(Collectors.toList()));
        return car;
    }
}
