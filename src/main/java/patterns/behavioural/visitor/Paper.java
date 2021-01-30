package patterns.behavioural.visitor;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Paper implements Trash {
    @Override
    public void throwOut() {
        log.info("Throw put paper.");
    }



    @Override
    public void recycle(Visitor visitor) {
        visitor.recyclePaper(this);
    }
}
