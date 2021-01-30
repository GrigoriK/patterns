package patterns.creation.prototype.carParts;

import lombok.Data;
import patterns.creation.prototype.carParts.enums.LighterType;
import patterns.creation.prototype.carParts.interfaces.Prototype;

@Data
public class Lighter extends Product implements Prototype<Lighter> {
    private LighterType lighterType;

    @Override
    public String toString() {
        return "Lighter{" +
                "lighterType=" + lighterType +
                ", "+
                getProductInformation()+
                '}';
    }

    @Override
    public Lighter getPrototype() {
        Lighter lighter = new Lighter();
        lighter.setLighterType(this.lighterType);
        lighter.setBrandName(this.getBrandName());
        lighter.setCost(this.getCost());
        return lighter;
    }
}
