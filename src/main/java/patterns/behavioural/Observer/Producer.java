package patterns.behavioural.Observer;

import java.util.Collection;

public interface Producer<T extends Event>{
    void addObserver(Observer<T> observer);
    void removeObserver(Observer<T>  observer);
    void notifyObserver(EventType eventType, T event);
    void notifyObservers(Collection<T> events);
    void addEvent(T event);
    void removeEvent(T event);
}
