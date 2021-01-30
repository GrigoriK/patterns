package patterns.behavioural.strategy;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Data
@Slf4j
public class ActivityBeforeGoToBed {
    private Strategy strategy;


    public void executeActivity(){
        if(strategy!=null) {
            strategy.executeActivity();
        }else {
          log.info("Strategy object is null");
        }
    }
}
