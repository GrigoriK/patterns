package patterns.creation.abstractFactory;

import patterns.creation.abstractFactory.enums.FactoryType;
import patterns.creation.abstractFactory.interfaces.TextileFactory;

public class AbstractTextileFactory {

    public static TextileFactory getFactory(FactoryType factoryType) {
        switch (factoryType) {
            case GUCCI: {
                return new GucciFactory();
            }
            case LV: {
                return new LVFactory();
            }
            default: {
                return null;
            }
        }
    }
}
