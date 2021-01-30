package patterns.structural.bridge.impl;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import patterns.structural.bridge.interfaces.Brand;
import patterns.structural.bridge.interfaces.Tablet;

@AllArgsConstructor
@Slf4j
public abstract class AbstractTablet implements Tablet {
    private Brand brand;


    @Override
    public void browse() {
        log.info("Browse the Internet by \"{}\"  {}  tablet",brand.getBrandName(),getType());
    }
    protected abstract String getType();
}
