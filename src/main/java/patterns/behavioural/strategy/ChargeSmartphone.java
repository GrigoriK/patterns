package patterns.behavioural.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class ChargeSmartphone implements Strategy {
    @Override
    public void executeActivity() {
        log.info("Charging smartphone...");
    }
}
