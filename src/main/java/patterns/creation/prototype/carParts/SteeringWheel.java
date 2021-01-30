package patterns.creation.prototype.carParts;

import lombok.Data;
import patterns.creation.prototype.carParts.interfaces.Prototype;

@Data
public class SteeringWheel extends Product  implements Prototype<SteeringWheel> {
    private boolean isSmart;

    @Override
    public String toString() {
        return "SteeringWheel{" +
                "isSmart=" + isSmart +
                ", "+
                getProductInformation()+
                '}';
    }

    @Override
    public SteeringWheel getPrototype() {
        SteeringWheel steeringWheel = new SteeringWheel();
       steeringWheel.setSmart(this.isSmart);
       steeringWheel.setBrandName(this.getBrandName());
       steeringWheel.setCost(this.getCost());
        return steeringWheel;
    }
}
