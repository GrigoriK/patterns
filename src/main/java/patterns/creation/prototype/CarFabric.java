package patterns.creation.prototype;

import patterns.creation.prototype.carParts.*;
import patterns.creation.prototype.carParts.enums.LighterType;

import java.util.Collection;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class CarFabric {

    public Car getNewTestCar() {
        Car car = new Car();
        car.setEngine(getTestEngine());
        car.setDoors(getTestDoors());
        car.setLighters(getTestLighters());
        car.setSteeringWheel(getTestSteeringWheel());
        car.setWindow(getTestWindow());
        car.setWheels(getTestWheels());
        return car;
    }

    public Car getCarWithBlueDoorsByPrototype(Car carPrototype){
        Car necessaryCar = carPrototype.getPrototype();
        necessaryCar.getDoors().forEach(door->door.setColor("blue"));
        return necessaryCar;

    }


    private Collection<Wheel> getTestWheels() {
        Wheel wheel = new Wheel();
        wheel.setBrandName("Michelin");
        wheel.setRadius(32);
        wheel.setCost(7000);
        return Stream.generate(wheel::getPrototype).limit(4).collect(Collectors.toList());
    }

    private Window getTestWindow() {
        Window window = new Window();
        window.setCost(15000);
        window.setBrandName("Top Windows");
        window.setWidth(2100);
        window.setHeight(1600);
        return window;
    }

    private SteeringWheel getTestSteeringWheel() {
        SteeringWheel steeringWheel = new SteeringWheel();
        steeringWheel.setSmart(false);
        steeringWheel.setBrandName("Сiambella");
        steeringWheel.setCost(5000);
        return steeringWheel;
    }

    private Collection<Lighter> getTestLighters() {
        Lighter lighter = new Lighter();
        lighter.setLighterType(LighterType.Halogen);
        lighter.setBrandName("Paradise lights");
        lighter.setCost(3000);
        return Stream.generate(lighter::getPrototype).limit(2).collect(Collectors.toList());
    }

    private Engine getTestEngine() {
        Engine engine = new Engine();
        engine.setCapacity(300);
        engine.setVolume(2.4);
        engine.setBrandName("Angry Jone");
        engine.setCost(50000);
        return engine;
    }

    private Collection<Door> getTestDoors() {
        Door door = new Door();
        door.setColor("yellow");
        door.setBrandName("Mr. doors");
        door.setCost(10000);
        return Stream.generate(door::getPrototype).limit(4).collect(Collectors.toList());


    }

}
