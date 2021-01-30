package patterns.behavioural.ChainOfResponsibility;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import patterns.behavioural.ChainOfResponsibility.enums.Priority;
@Data
@Slf4j
public abstract class Notifier {
    private Priority priority;
    private Notifier nextNotifier;

    public Notifier(Priority priority) {
        this.priority = priority;
    }

    public void notifyByPriority(String message, Priority priority){
        log.info("Notifier: {}",this.getClass().getSimpleName());
        if(priority.compareTo(this.priority) >= 0){
          writeMessage(message);
            if (nextNotifier!=null && priority.compareTo(this.priority)>0){
                nextNotifier.notifyByPriority(message,priority);
            }
        }


    }

    protected abstract void writeMessage(String message);
}
