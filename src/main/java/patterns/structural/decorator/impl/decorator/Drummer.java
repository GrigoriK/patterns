package patterns.structural.decorator.impl.decorator;

import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import patterns.structural.decorator.interfaces.Music;

@Data
@Slf4j
public class Drummer extends MusicDecorator {


    public Drummer(Music music) {
        super(music);
    }

    @Override
    public void play() {
        super.play();
        log.info("play drums");
    }
}
