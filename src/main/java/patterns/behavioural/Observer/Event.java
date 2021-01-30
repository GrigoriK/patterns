package patterns.behavioural.Observer;

import lombok.Data;

import java.util.UUID;

@Data
public class Event {

    private UUID id;


    public Event(UUID id) {
        this.id = id;
    }
}
