package patterns.behavioural.templateMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Pancakes extends Supper {
    @Override
    void buy() {
        log.info("Buy flour.");
        log.info("Buy eggs.");
        log.info("Buy eggs.");
        log.info("Buy milk.");
        log.info("etc.");

    }

    @Override
    void cook() {
        log.info("Take pan.");
        log.info("Cook dough.");
        log.info("Heat the pan");
        log.info("Bake pancakes");
    }
}
