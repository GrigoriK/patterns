package patterns.behavioural.ChainOfResponsibility;

import lombok.extern.slf4j.Slf4j;
import patterns.behavioural.ChainOfResponsibility.enums.Priority;
@Slf4j
public class JiraNotifier extends Notifier {

    public JiraNotifier() {
        super(Priority.NORMAL);
    }

    @Override
    protected void writeMessage(String message) {
        log.info("Jira notifier. Please see this bug: {}",message);

    }
}
