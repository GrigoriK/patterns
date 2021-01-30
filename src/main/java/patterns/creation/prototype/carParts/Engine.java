package patterns.creation.prototype.carParts;

import lombok.Data;
import patterns.creation.prototype.carParts.interfaces.Prototype;

@Data
public class Engine extends Product implements Prototype<Engine> {
    private int capacity;
    private double volume;

    @Override
    public String toString() {
        return "Engine{" +
                "capacity=" + capacity +
                ", volume=" + volume +
                ", "+
                getProductInformation()+
                '}';
    }

    @Override
    public Engine getPrototype() {
        Engine engine = new Engine();
        engine.setCapacity(320);
        engine.setBrandName("Legend");
        engine.setCost(this.getCost());
        return engine;
    }
}
