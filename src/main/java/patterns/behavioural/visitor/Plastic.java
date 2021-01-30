package patterns.behavioural.visitor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Plastic implements Trash {
    @Override
    public void throwOut() {
        log.info("Throw put plastic.");
    }



    @Override
    public void recycle(Visitor visitor) {
   visitor.recyclePlastic(this);
    }
}
