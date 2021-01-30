package patterns.behavioural.Observer;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;

import java.util.Collection;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
@Slf4j
public class Subscriber implements Observer<MusicTrack> {
    private String subscriberName;



    @Override
    public void handleEvents(Collection<MusicTrack> events) {
        log.info("Dear, {} ! This is a list of tracks in our music hosting{ {} }!",subscriberName,
                events.stream().map(MusicTrack::getUnifiedView).
                        collect(Collectors.joining(",")));
    }

    @Override
    public void handleEvent(EventType eventType, MusicTrack musicTrack) {
    switch (eventType){
        case ADD:{
            log.info("Dear, {} ! We add new track {}!\n",subscriberName,musicTrack.getUnifiedView());
            break;
        }
        case REMOVE:{
            log.info("Dear, {} ! We deleted {} at the request of the copyright holder!\n",
                    subscriberName,musicTrack.getUnifiedView());
            break;
        }
        default:{log.error("Wrong event type!!!");
            break;
        }
    }
    }
}
