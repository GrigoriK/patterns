package patterns.structural.proxy.impl;

import lombok.extern.slf4j.Slf4j;
import patterns.structural.proxy.interfaces.CartoonCup;
@Slf4j
public class SimpleCartoonCup implements CartoonCup {
    @Override
    public void produceCartoonCup() {
        log.info("Take cartoon");
        log.info("Produce cartoon cup");
    }
}
