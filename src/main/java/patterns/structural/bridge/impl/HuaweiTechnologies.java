package patterns.structural.bridge.impl;

import patterns.structural.bridge.interfaces.Brand;

public class HuaweiTechnologies  implements Brand {
    @Override
    public String getBrandName() {
        return "Huawei";
    }
}
