package patterns.creation.abstractFactory;

import patterns.creation.abstractFactory.enums.ClothesType;
import general.Color;
import patterns.creation.abstractFactory.enums.ShoesType;
import patterns.creation.abstractFactory.impl.Hat;
import patterns.creation.abstractFactory.impl.Slaps;
import patterns.creation.abstractFactory.impl.Sneakers;
import patterns.creation.abstractFactory.impl.TShirt;
import patterns.creation.abstractFactory.interfaces.Clothes;
import patterns.creation.abstractFactory.interfaces.Shoes;
import patterns.creation.abstractFactory.interfaces.TextileFactory;

public abstract class BigFactory  implements TextileFactory {
    protected String factoryName;

    public BigFactory(String factoryName) {
        this.factoryName = factoryName;
    }

    @Override
    public Clothes produceClothes(ClothesType clothesType, Color color) {
        switch (clothesType) {
            case T_SHIRT: {
                return new TShirt(factoryName,color);
            }
            case HAT: {
                return new Hat(factoryName,color);
            }
            default: {
                return null;
            }
        }
    }

    @Override
    public Shoes produceShoes(ShoesType shoesType, Color color) {
        switch (shoesType) {
            case SLAPS: {
                return new Slaps(factoryName,color);
            }
            case SNEAKERS: {
                return new Sneakers(factoryName,color);
            }
            default: {
                return null;
            }
        }
    }
}
