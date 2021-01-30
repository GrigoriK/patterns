package patterns.structural.proxy;

import patterns.structural.proxy.impl.SimpleCartoonCup;

public  abstract class Cafe {
    private BrandingCup brandingCup;

    public Cafe() {
        this.brandingCup = new BrandingCup(new SimpleCartoonCup(),getBrandName());
    }

    abstract String getBrandName();
    public void produceBrandingCups(){
        brandingCup.produceCartoonCup();
    }
}
