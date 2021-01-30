package patterns.behavioural.ChainOfResponsibility;

import lombok.extern.slf4j.Slf4j;
import patterns.behavioural.ChainOfResponsibility.enums.Priority;
@Slf4j
public class CallNotifier extends Notifier {
    public CallNotifier() {
        super(Priority.SUPER_CRITICAL);
    }

    @Override
    protected void writeMessage(String message) {
        log.info("Call senior developer. We have huge problem: {}",message);
    }
}
