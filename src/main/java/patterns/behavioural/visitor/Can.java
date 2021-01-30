package patterns.behavioural.visitor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Can implements Trash {
    @Override
    public void throwOut() {
 log.info("Throw put can.");
    }


    @Override
    public void recycle(Visitor visitor) {
        visitor.recyclePCan(this);
    }
}
