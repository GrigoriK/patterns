package patterns.structural.decorator.impl;

import lombok.extern.slf4j.Slf4j;
import patterns.structural.decorator.interfaces.Music;
@Slf4j
public class Orchestra implements Music {
    @Override
    public void play() {
        log.info("play violin, play saxophone, play flute");
    }
}
