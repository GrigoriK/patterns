package patterns.behavioural.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Training implements State  {
    @Override
    public void doSomeActivity() {
        log.info("I'm training");
    }
}
