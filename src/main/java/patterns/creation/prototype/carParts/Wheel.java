package patterns.creation.prototype.carParts;

import lombok.Data;
import patterns.creation.prototype.carParts.interfaces.Prototype;

@Data
public class Wheel extends Product implements Prototype<Wheel> {
    private int radius;

    @Override
    public String toString() {
        return "Wheel{" +
                "radius=" + radius +
                ", "+
                getProductInformation()+
                '}';
    }

    @Override
    public Wheel getPrototype() {
        Wheel wheel = new Wheel();
        wheel.setRadius(this.radius);
        wheel.setBrandName(this.getBrandName());
        wheel.setCost(this.getCost());
        return wheel;
    }
}
