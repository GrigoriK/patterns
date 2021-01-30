package patterns.behavioural.visitor;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Data
public class Incinerationplant implements Visitor {
    @Override
    public void recyclePaper(Paper paper) {
        log.info("Recycle paper");
    }

    @Override
    public void recyclePlastic(Plastic plastic) {
        log.info("Recycle plastic");
    }

    @Override
    public void recyclePCan(Can can) {
        log.info("Recycle can");
    }
}
