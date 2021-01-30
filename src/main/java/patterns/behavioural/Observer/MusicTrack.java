package patterns.behavioural.Observer;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.UUID;

@EqualsAndHashCode(callSuper = true)
@Data
public class MusicTrack extends Event {
    private String musicianName;
    private String trackName;


    public MusicTrack(UUID id, String musicianName, String trackName) {
        super(id);
        this.musicianName = musicianName;
        this.trackName = trackName;
    }

    public String getUnifiedView() {
        return musicianName + ": " + trackName;

    }

}
