package patterns.structural.decorator.impl.decorator;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import patterns.structural.decorator.interfaces.Music;

@Data
@Slf4j
public class Singer   extends MusicDecorator {
    public Singer(Music music) {
        super(music);
    }

    @Override
    public void play() {
        super.play();
        log.info("sing a beautiful song");
    }
}
