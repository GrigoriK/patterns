package patterns.structural.decorator.impl.decorator;

import lombok.Data;
import patterns.structural.decorator.interfaces.Music;

@Data
public abstract class MusicDecorator implements Music {
    private Music music;

    public MusicDecorator(Music music) {
        this.music = music;
    }

    @Override
    public void play() {
        music.play();
    }
}
