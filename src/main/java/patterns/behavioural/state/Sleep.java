package patterns.behavioural.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Sleep implements State  {
    @Override
    public void doSomeActivity() {
     log.info("Sleeping");
    }
}
