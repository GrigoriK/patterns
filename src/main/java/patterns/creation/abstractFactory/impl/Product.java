package patterns.creation.abstractFactory.impl;

import lombok.AllArgsConstructor;
import general.Color;

@AllArgsConstructor
public abstract class Product {
    protected String productManufacturer;
    protected Color color;

}
