package patterns.behavioural.templateMethod;

import lombok.extern.slf4j.Slf4j;

@Slf4j
public abstract class Supper {
    abstract void buy();

    abstract void cook();

    public void cookSomething() {
        log.info("First of all, need to go to the shop.");
        buy();
        log.info("Home, sweet home.");
        cook();
        log.info("Bon appetite!");
    }
}
