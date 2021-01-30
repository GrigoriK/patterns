package patterns.structural.bridge.impl;

import patterns.structural.bridge.interfaces.Brand;

public class MobileTelephone extends AbstractTelephone {
    public MobileTelephone(Brand brand) {
        super(brand);
    }

    @Override
    protected String getType() {
        return "Mobile";
    }
}
