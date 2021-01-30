package patterns.behavioural.templateMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Spaghetti extends Supper {
    @Override
    void buy() {
       log.info("Need to buy spaghetti.");
    }

    @Override
    void cook() {
        log.info("Need to take pan.");
        log.info("Need to boiled water.");
        log.info("Put spaghetti into boiled water.");

    }
}
