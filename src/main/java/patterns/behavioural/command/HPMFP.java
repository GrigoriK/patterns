package patterns.behavioural.command;

import lombok.extern.slf4j.Slf4j;
import patterns.behavioural.command.interfaces.MFP;

@Slf4j
public class HPMFP implements MFP {
    @Override
    public void print() {
        log.info("Print document");
    }

    @Override
    public void scan() {
        log.info("Scan document");
    }

    @Override
    public void copy() {
        log.info("Copy document");
    }
}
