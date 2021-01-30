package patterns.behavioural.Observer;

import java.util.Collection;

public interface Observer <T extends Event> {
    void handleEvents(Collection<T> events);
    void handleEvent(EventType eventType,T event);
}
