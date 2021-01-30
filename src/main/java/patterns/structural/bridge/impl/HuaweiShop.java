package patterns.structural.bridge.impl;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class HuaweiShop {

    public static void sellHuaweiMobilePone() {

        MobileTelephone mobileTelephone = new MobileTelephone(new HuaweiTechnologies());
        log.info("Test mobile phone");
        mobileTelephone.ring();
    }

    public static void sellHuaweiTablet() {

        TabletImpl tablet = new TabletImpl(new HuaweiTechnologies());
        log.info("Test tablet");
        tablet.browse();

    }
}
