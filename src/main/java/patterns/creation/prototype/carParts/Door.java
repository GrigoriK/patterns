package patterns.creation.prototype.carParts;

import lombok.Data;
import patterns.creation.prototype.carParts.interfaces.Prototype;

@Data
public class Door extends Product  implements Prototype<Door> {
   private String color;

   @Override
   public String toString() {
      return "Door{" +
              "color='" + color + '\'' +
              ", "+
              getProductInformation()+
              '}';
   }

   @Override
   public Door getPrototype() {
      Door door = new Door();
      door.setColor(this.color);
      door.setBrandName(this.getBrandName());
      door.setCost(this.getCost());
      return door;
   }
}
