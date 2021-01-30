package patterns.behavioural.state;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Work implements State  {
    @Override
    public void doSomeActivity(){
        log.info("Please be quite, I'm working");
    }
}
