package patterns.behavioural.Observer;

import lombok.Data;

import java.util.*;

@Data
public class MusicAudioHosting implements Producer <MusicTrack> {
    private Collection<Observer<MusicTrack>> observers = new HashSet<>();
    private Map<UUID, Event> idToMusicTrack = new HashMap<>();

    @Override
    public void addObserver(Observer<MusicTrack> observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer<MusicTrack>  observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(EventType eventType, MusicTrack event) {
        observers.forEach(observer -> observer.handleEvent(eventType, event));
    }

    @Override
    public void notifyObservers(Collection<MusicTrack> events) {
        observers.forEach(observer -> observer.handleEvents(events));
    }

    @Override
    public void addEvent(MusicTrack event) {
        idToMusicTrack.putIfAbsent(event.getId(), event);
        notifyObserver(EventType.ADD, event);

    }

    @Override
    public void removeEvent(MusicTrack event) {
        idToMusicTrack.remove(event.getId());
        notifyObserver(EventType.REMOVE, event);


    }
}
