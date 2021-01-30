package patterns.behavioural.ChainOfResponsibility;

import lombok.extern.slf4j.Slf4j;
import patterns.behavioural.ChainOfResponsibility.enums.Priority;

@Slf4j
public class EmailNotifier extends Notifier {
    public EmailNotifier() {
        super(Priority.CRITICAL);
    }

    @Override
    protected void writeMessage(String message) {
        log.info("Email notifier.It's very important. Please see this bug: {}",message);
    }
}
