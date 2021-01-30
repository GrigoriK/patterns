package patterns.structural.bridge.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import patterns.structural.bridge.interfaces.Brand;
import patterns.structural.bridge.interfaces.Telephone;

@AllArgsConstructor
@Slf4j
public abstract class AbstractTelephone  implements Telephone {
    private Brand brand;


    @Override
    public void ring() {
        log.info("Ring by \"{}\"   {} telephone",brand.getBrandName(),getType());
    }
    protected abstract String getType();
}
