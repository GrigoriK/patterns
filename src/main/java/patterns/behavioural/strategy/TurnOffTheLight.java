package patterns.behavioural.strategy;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class TurnOffTheLight implements Strategy {
    @Override
    public void executeActivity() {
        log.info("Turn off the light");
    }
}
