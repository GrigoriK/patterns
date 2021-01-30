package patterns.structural.bridge.impl;

import patterns.structural.bridge.interfaces.Brand;

public class TabletImpl extends AbstractTablet {

    public TabletImpl(Brand brand) {
        super(brand);
    }

    @Override
    protected String getType() {
        return "just tablet";
    }
}
