package patterns.creation.abstractFactory.interfaces;

import patterns.creation.abstractFactory.enums.ClothesType;
import general.Color;
import patterns.creation.abstractFactory.enums.ShoesType;

public interface TextileFactory {
   Clothes produceClothes(ClothesType clothesType,Color color);
   Shoes produceShoes(ShoesType shoesType, Color color);
}
