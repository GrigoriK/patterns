package patterns.creation.factory.impl;

import lombok.extern.slf4j.Slf4j;
import patterns.creation.factory.interfaces.Telephone;

@Slf4j
public class MobileTelephone implements Telephone {

    @Override
    public void call() {
        log.info("Open 'Phone' application");
        log.info("Dial necessary number");
        log.info("Call");
    }
}
