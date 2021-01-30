package patterns.creation.abstractFactory.impl;

import lombok.extern.slf4j.Slf4j;
import general.Color;
import patterns.creation.abstractFactory.interfaces.Clothes;

@Slf4j
public class Hat extends  Product implements Clothes  {

    public Hat(String productManufacturer, Color color) {
        super(productManufacturer, color);
    }

    @Override
    public void sew() {
        log.info("Get {} threads",color.name().toLowerCase());
        log.info("Start sewing");
        log.info("Finish sewing");
        log.info("Get {} hat",productManufacturer);
    }
}
