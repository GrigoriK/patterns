package patterns.creation.prototype.carParts;

import lombok.Data;
import patterns.creation.prototype.carParts.interfaces.Prototype;

@Data
public class Window  extends Product  implements Prototype<Window> {
    private int width;
    private int height;

    @Override
    public String toString() {
        return "Window{" +
                "width=" + width +
                ", height=" + height +
                ", "+
                getProductInformation()+
                '}';
    }

    @Override
    public Window getPrototype() {
        Window window = new Window();
        window.setHeight(this.height);
        window.setWidth(this.width);
        window.setBrandName(this.getBrandName());
        window.setCost(this.getCost());
        return window;
    }
}
